/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.29
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.sleepycat.db.internal;

import com.sleepycat.db.*;
import java.util.Comparator;

public class DbEnv {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected DbEnv(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DbEnv obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* package */ void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      throw new UnsupportedOperationException("C++ destructor does not have public access");
    }
    swigCPtr = 0;
  }

	/*
	 * Internally, the JNI layer creates a global reference to each DbEnv,
	 * which can potentially be different to this.  We keep a copy here so
	 * we can clean up after destructors.
	 */
	private long dbenv_ref;
	public Environment wrapper;

	private LogRecordHandler app_dispatch_handler;
	private EventHandler event_notify_handler;
	private FeedbackHandler env_feedback_handler;
	private ErrorHandler error_handler;
	private String errpfx;
	private MessageHandler message_handler;
	private PanicHandler panic_handler;
	private ReplicationTransport rep_transport_handler;
	private java.io.OutputStream error_stream;
	private java.io.OutputStream message_stream;

	public static class RepProcessMessage {
		public int envid;
	}

	/*
	 * Called by the public DbEnv constructor and for private environments
	 * by the Db constructor.
	 */
	void initialize() {
		dbenv_ref = db_java.initDbEnvRef0(this, this);
		/* Start with System.err as the default error stream. */
		set_error_stream(System.err);
		set_message_stream(System.out);
	}

	void cleanup() {
		swigCPtr = 0;
		db_java.deleteRef0(dbenv_ref);
		dbenv_ref = 0L;
	}

	public synchronized void close(int flags) throws DatabaseException {
		try {
			close0(flags);
		} finally {
			cleanup();
		}
	}

	private final int handle_app_dispatch(DatabaseEntry dbt,
	                                      LogSequenceNumber lsn,
	                                      int recops) {
		return app_dispatch_handler.handleLogRecord(wrapper, dbt, lsn,
		    RecoveryOperation.fromFlag(recops));
	}

	public LogRecordHandler get_app_dispatch() throws com.sleepycat.db.DatabaseException {
		return app_dispatch_handler;
	}

	private final int handle_event_notify(int event) {
		return event_notify_handler.handleEvent(EventType.fromInt(event));
	}

	public EventHandler get_event_notify() throws com.sleepycat.db.DatabaseException {
		return event_notify_handler;
	}

	private final void handle_env_feedback(int opcode, int percent) {
		if (opcode == DbConstants.DB_RECOVER)
			env_feedback_handler.recoveryFeedback(wrapper, percent);
		/* No other environment feedback type supported. */
	}

	public FeedbackHandler get_feedback() throws com.sleepycat.db.DatabaseException {
		return env_feedback_handler;
	}

	public void set_errpfx(String errpfx) /* no exception */ {
		this.errpfx = errpfx;
	}

	public String get_errpfx() /* no exception */ {
		return errpfx;
	}

	private final void handle_error(String msg) {
		error_handler.error(wrapper, this.errpfx, msg);
	}

	public ErrorHandler get_errcall() /* no exception */ {
		return error_handler;
	}

	private final void handle_message(String msg) {
		message_handler.message(wrapper, msg);
	}

	public MessageHandler get_msgcall() /* no exception */ {
		return message_handler;
	}

	private final void handle_panic(DatabaseException e) {
		panic_handler.panic(wrapper, e);
	}

	public PanicHandler get_paniccall() throws com.sleepycat.db.DatabaseException {
		return panic_handler;
	}

	private final int handle_rep_transport(DatabaseEntry control,
	                                       DatabaseEntry rec,
	                                       LogSequenceNumber lsn,
	                                       int envid, int flags)
	    throws DatabaseException {
		return rep_transport_handler.send(wrapper,
		    control, rec, lsn, envid,
		    (flags & DbConstants.DB_REP_NOBUFFER) != 0,
                    (flags & DbConstants.DB_REP_PERMANENT) != 0,
                    (flags & DbConstants.DB_REP_ANYWHERE) != 0,
                    (flags & DbConstants.DB_REP_REREQUEST) != 0);
	}

	public void lock_vec(/*u_int32_t*/ int locker, int flags,
	                     LockRequest[] list, int offset, int count)
	    throws DatabaseException {
		db_javaJNI.DbEnv_lock_vec(swigCPtr, locker, flags, list,
		    offset, count);
	}

	public synchronized void remove(String db_home, int flags)
	    throws DatabaseException, java.io.FileNotFoundException {
		try {
			remove0(db_home, flags);
		} finally {
			cleanup();
		}
	}

	public void set_error_stream(java.io.OutputStream stream) /* no exception */ {
		error_stream = stream;
		final java.io.PrintWriter pw = new java.io.PrintWriter(stream);
		set_errcall(new ErrorHandler() {
			public void error(Environment env,
			    String prefix, String buf) /* no exception */ {
				if (prefix != null)
					pw.print(prefix + ": ");
				pw.println(buf);
				pw.flush();
			}
		});
	}

	public java.io.OutputStream get_error_stream() /* no exception */ {
		return error_stream;
	}


	public void set_message_stream(java.io.OutputStream stream) /* no exception */ {
		message_stream = stream;
		final java.io.PrintWriter pw = new java.io.PrintWriter(stream);
		set_msgcall(new MessageHandler() {
			public void message(Environment env, String msg) /* no exception */
			    /* no exception */ {
				pw.println(msg);
				pw.flush();
			}
		});
	}

	public java.io.OutputStream get_message_stream() /* no exception */ {
		return message_stream;
	}

	public void set_tx_timestamp(java.util.Date timestamp) throws com.sleepycat.db.DatabaseException {
		set_tx_timestamp0(timestamp.getTime()/1000);
	}

  public DbEnv(int flags) throws com.sleepycat.db.DatabaseException {
    this(db_javaJNI.new_DbEnv(flags), true);
    initialize();
  }

  /* package */ void close0(int flags) { db_javaJNI.DbEnv_close0(swigCPtr, flags); }

  public void dbremove(DbTxn txnid, String file, String database, int flags) throws com.sleepycat.db.DatabaseException, java.io.FileNotFoundException { db_javaJNI.DbEnv_dbremove(swigCPtr, DbTxn.getCPtr(txnid), file, database, flags); }

  public void dbrename(DbTxn txnid, String file, String database, String newname, int flags) throws com.sleepycat.db.DatabaseException, java.io.FileNotFoundException { db_javaJNI.DbEnv_dbrename(swigCPtr, DbTxn.getCPtr(txnid), file, database, newname, flags); }

  public void err(int error, String message) /* no exception */ {
    db_javaJNI.DbEnv_err(swigCPtr, error, message);
  }

  public void errx(String message) /* no exception */ {
    db_javaJNI.DbEnv_errx(swigCPtr, message);
  }

  public DbTxn cdsgroup_begin() throws com.sleepycat.db.DatabaseException {
    long cPtr = db_javaJNI.DbEnv_cdsgroup_begin(swigCPtr);
    return (cPtr == 0) ? null : new DbTxn(cPtr, false);
  }

  public void fileid_reset(String file, int flags) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_fileid_reset(swigCPtr, file, flags); }

  public String[] get_data_dirs() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_data_dirs(swigCPtr); }

  public int get_encrypt_flags() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_encrypt_flags(swigCPtr); }

  public int get_flags() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_flags(swigCPtr); }

  public String get_home() throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_get_home(swigCPtr);
  }

  public int get_open_flags() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_open_flags(swigCPtr); }

  public long get_shm_key() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_shm_key(swigCPtr); }

  public String get_tmp_dir() throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_get_tmp_dir(swigCPtr);
  }

  public boolean get_verbose(int which) throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_verbose(swigCPtr, which); }

  public boolean is_bigendian() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_is_bigendian(swigCPtr); }

  public void lsn_reset(String file, int flags) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_lsn_reset(swigCPtr, file, flags); }

  public void open(String db_home, int flags, int mode) throws com.sleepycat.db.DatabaseException, java.io.FileNotFoundException { db_javaJNI.DbEnv_open(swigCPtr, db_home, flags, mode); }

  /* package */ void remove0(String db_home, int flags) { db_javaJNI.DbEnv_remove0(swigCPtr, db_home, flags); }

  public void set_cachesize(long bytes, int ncache) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_cachesize(swigCPtr, bytes, ncache); }

  public void set_data_dir(String dir) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_data_dir(swigCPtr, dir); }

  public void set_intermediate_dir(int mode, int flags) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_intermediate_dir(swigCPtr, mode, flags); }

  public void set_encrypt(String passwd, int flags) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_encrypt(swigCPtr, passwd, flags); }

  public void set_errcall(com.sleepycat.db.ErrorHandler db_errcall_fcn) /* no exception */ {
    db_javaJNI.DbEnv_set_errcall(swigCPtr,  (error_handler = db_errcall_fcn) );
  }

  public void set_flags(int flags, boolean onoff) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_flags(swigCPtr, flags, onoff); }

  public void set_feedback(com.sleepycat.db.FeedbackHandler env_feedback_fcn) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_feedback(swigCPtr,  (env_feedback_handler = env_feedback_fcn) ); }

  public void set_mp_max_openfd(int maxopenfd) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_mp_max_openfd(swigCPtr, maxopenfd); }

  public void set_mp_max_write(int maxwrite, int maxwrite_sleep) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_mp_max_write(swigCPtr, maxwrite, maxwrite_sleep); }

  public void set_mp_mmapsize(long mp_mmapsize) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_mp_mmapsize(swigCPtr, mp_mmapsize); }

  public void set_msgcall(com.sleepycat.db.MessageHandler db_msgcall_fcn) /* no exception */ {
    db_javaJNI.DbEnv_set_msgcall(swigCPtr,  (message_handler = db_msgcall_fcn) );
  }

  public void set_paniccall(com.sleepycat.db.PanicHandler db_panic_fcn) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_paniccall(swigCPtr,  (panic_handler = db_panic_fcn) ); }

  public void set_rpc_server(String host, long cl_timeout, long sv_timeout, int flags) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_rpc_server(swigCPtr, host, cl_timeout, sv_timeout, flags); }

  public void set_shm_key(long shm_key) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_shm_key(swigCPtr, shm_key); }

  public void set_timeout(long timeout, int flags) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_timeout(swigCPtr, timeout, flags); }

  public void set_tmp_dir(String dir) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_tmp_dir(swigCPtr, dir); }

  public void set_tx_max(int max) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_tx_max(swigCPtr, max); }

  public void set_app_dispatch(com.sleepycat.db.LogRecordHandler tx_recover) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_app_dispatch(swigCPtr,  (app_dispatch_handler = tx_recover) ); }

  public void set_event_notify(com.sleepycat.db.EventHandler event_notify) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_event_notify(swigCPtr,  (event_notify_handler = event_notify) ); }

  /* package */ void set_tx_timestamp0(long timestamp) { db_javaJNI.DbEnv_set_tx_timestamp0(swigCPtr, timestamp); }

  public void set_verbose(int which, boolean onoff) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_verbose(swigCPtr, which, onoff); }

  public byte[][] get_lk_conflicts() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_lk_conflicts(swigCPtr); }

  public int get_lk_detect() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_lk_detect(swigCPtr); }

  public int get_lk_max_locks() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_lk_max_locks(swigCPtr); }

  public int get_lk_max_lockers() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_lk_max_lockers(swigCPtr); }

  public int get_lk_max_objects() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_lk_max_objects(swigCPtr); }

  public int lock_detect(int flags, int atype) throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_lock_detect(swigCPtr, flags, atype);
  }

  public DbLock lock_get(int locker, int flags, com.sleepycat.db.DatabaseEntry object, int lock_mode) throws com.sleepycat.db.DatabaseException {
    long cPtr = db_javaJNI.DbEnv_lock_get(swigCPtr, locker, flags, object, lock_mode);
    return (cPtr == 0) ? null : new DbLock(cPtr, true);
  }

  public int lock_id() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_lock_id(swigCPtr); }

  public void lock_id_free(int id) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_lock_id_free(swigCPtr, id); }

  public void lock_put(DbLock lock) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_lock_put(swigCPtr, DbLock.getCPtr(lock)); }

  public com.sleepycat.db.LockStats lock_stat(int flags) throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_lock_stat(swigCPtr, flags); }

  public void set_lk_conflicts(byte[][] conflicts) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_lk_conflicts(swigCPtr, conflicts); }

  public void set_lk_detect(int detect) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_lk_detect(swigCPtr, detect); }

  public void set_lk_max_lockers(int max) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_lk_max_lockers(swigCPtr, max); }

  public void set_lk_max_locks(int max) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_lk_max_locks(swigCPtr, max); }

  public void set_lk_max_objects(int max) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_lk_max_objects(swigCPtr, max); }

  public int get_lg_bsize() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_lg_bsize(swigCPtr); }

  public String get_lg_dir() throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_get_lg_dir(swigCPtr);
  }

  public int get_lg_filemode() throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_get_lg_filemode(swigCPtr);
  }

  public int get_lg_max() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_lg_max(swigCPtr); }

  public int get_lg_regionmax() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_lg_regionmax(swigCPtr); }

  public String[] log_archive(int flags) throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_log_archive(swigCPtr, flags); }

  public static int log_compare(com.sleepycat.db.LogSequenceNumber lsn0, com.sleepycat.db.LogSequenceNumber lsn1) /* no exception */ {
    return db_javaJNI.DbEnv_log_compare(lsn0, lsn1);
  }

  public DbLogc log_cursor(int flags) throws com.sleepycat.db.DatabaseException {
    long cPtr = db_javaJNI.DbEnv_log_cursor(swigCPtr, flags);
    return (cPtr == 0) ? null : new DbLogc(cPtr, true);
  }

  public String log_file(com.sleepycat.db.LogSequenceNumber lsn) throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_log_file(swigCPtr, lsn);
  }

  public void log_flush(com.sleepycat.db.LogSequenceNumber lsn_or_null) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_log_flush(swigCPtr, lsn_or_null); }

  public void log_put(com.sleepycat.db.LogSequenceNumber lsn, com.sleepycat.db.DatabaseEntry data, int flags) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_log_put(swigCPtr, lsn, data, flags); }

  public void log_print(DbTxn txn, String msg) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_log_print(swigCPtr, DbTxn.getCPtr(txn), msg); }

  public com.sleepycat.db.LogStats log_stat(int flags) throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_log_stat(swigCPtr, flags); }

  public void set_lg_bsize(int lg_bsize) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_lg_bsize(swigCPtr, lg_bsize); }

  public void set_lg_dir(String dir) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_lg_dir(swigCPtr, dir); }

  public void set_lg_filemode(int mode) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_lg_filemode(swigCPtr, mode); }

  public void set_lg_max(int lg_max) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_lg_max(swigCPtr, lg_max); }

  public void set_lg_regionmax(int lg_regionmax) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_lg_regionmax(swigCPtr, lg_regionmax); }

  public long get_cachesize() throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_get_cachesize(swigCPtr);
  }

  public int get_cachesize_ncache() throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_get_cachesize_ncache(swigCPtr);
  }

  public int get_mp_max_openfd() throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_get_mp_max_openfd(swigCPtr);
  }

  public int get_mp_max_write() throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_get_mp_max_write(swigCPtr);
  }

  public int get_mp_max_write_sleep() throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_get_mp_max_write_sleep(swigCPtr);
  }

  public long get_mp_mmapsize() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_mp_mmapsize(swigCPtr); }

  public com.sleepycat.db.CacheStats memp_stat(int flags) throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_memp_stat(swigCPtr, flags); }

  public com.sleepycat.db.CacheFileStats[] memp_fstat(int flags) throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_memp_fstat(swigCPtr, flags); }

  public int memp_trickle(int percent) throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_memp_trickle(swigCPtr, percent);
  }

  public int mutex_get_align() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_mutex_get_align(swigCPtr); }

  public int mutex_get_increment() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_mutex_get_increment(swigCPtr); }

  public int mutex_get_max() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_mutex_get_max(swigCPtr); }

  public int mutex_get_tas_spins() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_mutex_get_tas_spins(swigCPtr); }

  public void mutex_set_align(int align) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_mutex_set_align(swigCPtr, align); }

  public void mutex_set_increment(int increment) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_mutex_set_increment(swigCPtr, increment); }

  public void mutex_set_max(int mutex_max) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_mutex_set_max(swigCPtr, mutex_max); }

  public void mutex_set_tas_spins(int tas_spins) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_mutex_set_tas_spins(swigCPtr, tas_spins); }

  public com.sleepycat.db.MutexStats mutex_stat(int flags) throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_mutex_stat(swigCPtr, flags); }

  public int get_tx_max() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_tx_max(swigCPtr); }

  public long get_tx_timestamp() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_tx_timestamp(swigCPtr); }

  public long get_timeout(int flag) throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_get_timeout(swigCPtr, flag); }

  public DbTxn txn_begin(DbTxn parent, int flags) throws com.sleepycat.db.DatabaseException {
    long cPtr = db_javaJNI.DbEnv_txn_begin(swigCPtr, DbTxn.getCPtr(parent), flags);
    return (cPtr == 0) ? null : new DbTxn(cPtr, false);
  }

  public void txn_checkpoint(int kbyte, int min, int flags) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_txn_checkpoint(swigCPtr, kbyte, min, flags); }

  public com.sleepycat.db.PreparedTransaction[] txn_recover(int count, int flags) throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_txn_recover(swigCPtr, count, flags); }

  public com.sleepycat.db.TransactionStats txn_stat(int flags) throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_txn_stat(swigCPtr, flags); }

  public long rep_get_limit() throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_rep_get_limit(swigCPtr);
  }

  public int rep_elect(int nsites, int nvotes, int flags) throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_rep_elect(swigCPtr, nsites, nvotes, flags);
  }

  public int rep_process_message(com.sleepycat.db.DatabaseEntry control, com.sleepycat.db.DatabaseEntry rec, DbEnv.RepProcessMessage envid, com.sleepycat.db.LogSequenceNumber ret_lsn) /* no exception */ {
    return db_javaJNI.DbEnv_rep_process_message(swigCPtr, control, rec, envid, ret_lsn);
  }

  public void rep_flush() throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_rep_flush(swigCPtr); }

  public void rep_set_config(int which, boolean onoff) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_rep_set_config(swigCPtr, which, onoff); }

  public void rep_start(com.sleepycat.db.DatabaseEntry cdata, int flags) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_rep_start(swigCPtr, cdata, flags); }

  public void rep_sync(int flags) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_rep_sync(swigCPtr, flags); }

  public boolean rep_get_config(int which) throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_rep_get_config(swigCPtr, which); }

  public com.sleepycat.db.ReplicationStats rep_stat(int flags) throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_rep_stat(swigCPtr, flags); }

  public void rep_set_limit(long bytes) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_rep_set_limit(swigCPtr, bytes); }

  public void set_rep_request(int min, int max) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_set_rep_request(swigCPtr, min, max); }

  public void rep_set_transport(int envid, com.sleepycat.db.ReplicationTransport send) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_rep_set_transport(swigCPtr, envid,  (rep_transport_handler = send) ); }

  public int rep_get_nsites() throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_rep_get_nsites(swigCPtr);
  }

  public int rep_get_priority() throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_rep_get_priority(swigCPtr);
  }

  public int rep_get_timeout(int which) throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_rep_get_timeout(swigCPtr, which); }

  public void rep_set_nsites(int number) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_rep_set_nsites(swigCPtr, number); }

  public void rep_set_priority(int priority) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_rep_set_priority(swigCPtr, priority); }

  public void rep_set_timeout(int which, long timeout) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_rep_set_timeout(swigCPtr, which, timeout); }

  public int repmgr_add_remote_site(String host, int port, int flags) throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.DbEnv_repmgr_add_remote_site(swigCPtr, host, port, flags);
  }

  public void repmgr_get_ack_policy() throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_repmgr_get_ack_policy(swigCPtr); }

  public void repmgr_set_ack_policy(int policy) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_repmgr_set_ack_policy(swigCPtr, policy); }

  public void repmgr_set_local_site(String host, int port, int flags) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_repmgr_set_local_site(swigCPtr, host, port, flags); }

  public com.sleepycat.db.ReplicationHostAddress[] repmgr_site_list() throws com.sleepycat.db.DatabaseException { return db_javaJNI.DbEnv_repmgr_site_list(swigCPtr); }

  public void repmgr_start(int nthreads, int flags) throws com.sleepycat.db.DatabaseException { db_javaJNI.DbEnv_repmgr_start(swigCPtr, nthreads, flags); }

  public static String strerror(int error) /* no exception */ {
    return db_javaJNI.DbEnv_strerror(error);
  }

  public static int get_version_major() /* no exception */ {
    return db_javaJNI.DbEnv_get_version_major();
  }

  public static int get_version_minor() /* no exception */ {
    return db_javaJNI.DbEnv_get_version_minor();
  }

  public static int get_version_patch() /* no exception */ {
    return db_javaJNI.DbEnv_get_version_patch();
  }

  public static String get_version_string() /* no exception */ {
    return db_javaJNI.DbEnv_get_version_string();
  }

}
