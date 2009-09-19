/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_sleepycat_db_DbEnv */

#ifndef _Included_com_sleepycat_db_DbEnv
#define _Included_com_sleepycat_db_DbEnv
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    _close
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv__1close
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    err
 * Signature: (ILjava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_err
  (JNIEnv *, jobject, jint, jstring);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    errx
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_errx
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    _finalize
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv__1finalize
  (JNIEnv *, jobject);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    _init
 * Signature: (Lcom/sleepycat/db/DbErrcall;I)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv__1init
  (JNIEnv *, jobject, jobject, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    _init_using_db
 * Signature: (Lcom/sleepycat/db/DbErrcall;Lcom/sleepycat/db/Db;)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv__1init_1using_1db
  (JNIEnv *, jobject, jobject, jobject);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    _notify_db_close
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv__1notify_1db_1close
  (JNIEnv *, jobject);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    open
 * Signature: (Ljava/lang/String;II)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_open
  (JNIEnv *, jobject, jstring, jint, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    remove
 * Signature: (Ljava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_remove
  (JNIEnv *, jobject, jstring, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_cachesize
 * Signature: (III)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1cachesize
  (JNIEnv *, jobject, jint, jint, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_errcall
 * Signature: (Lcom/sleepycat/db/DbErrcall;)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1errcall
  (JNIEnv *, jobject, jobject);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_errpfx
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1errpfx
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    feedback_changed
 * Signature: (Lcom/sleepycat/db/DbFeedback;)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_feedback_1changed
  (JNIEnv *, jobject, jobject);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_verbose
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1verbose
  (JNIEnv *, jobject, jint, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_data_dir
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1data_1dir
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_lg_bsize
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1lg_1bsize
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_lg_dir
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1lg_1dir
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_lg_max
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1lg_1max
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_lk_conflicts
 * Signature: ([[B)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1lk_1conflicts
  (JNIEnv *, jobject, jobjectArray);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_lk_detect
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1lk_1detect
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_lk_max
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1lk_1max
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_mp_mmapsize
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1mp_1mmapsize
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_mutexlocks
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1mutexlocks
  (JNIEnv *, jclass, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_pageyield
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1pageyield
  (JNIEnv *, jclass, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_panicstate
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1panicstate
  (JNIEnv *, jclass, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    recovery_init_changed
 * Signature: (Lcom/sleepycat/db/DbRecoveryInit;)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_recovery_1init_1changed
  (JNIEnv *, jobject, jobject);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_region_init
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1region_1init
  (JNIEnv *, jclass, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_server
 * Signature: (Ljava/lang/String;JJI)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1server
  (JNIEnv *, jobject, jstring, jlong, jlong, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_shm_key
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1shm_1key
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_tas_spins
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1tas_1spins
  (JNIEnv *, jclass, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_tmp_dir
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1tmp_1dir
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    set_tx_max
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_set_1tx_1max
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    _set_tx_timestamp
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv__1set_1tx_1timestamp
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    get_version_major
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_sleepycat_db_DbEnv_get_1version_1major
  (JNIEnv *, jclass);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    get_version_minor
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_sleepycat_db_DbEnv_get_1version_1minor
  (JNIEnv *, jclass);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    get_version_patch
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_sleepycat_db_DbEnv_get_1version_1patch
  (JNIEnv *, jclass);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    get_version_string
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_sleepycat_db_DbEnv_get_1version_1string
  (JNIEnv *, jclass);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    strerror
 * Signature: (I)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_sleepycat_db_DbEnv_strerror
  (JNIEnv *, jclass, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    lock_detect
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_sleepycat_db_DbEnv_lock_1detect
  (JNIEnv *, jobject, jint, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    lock_get
 * Signature: (IILcom/sleepycat/db/Dbt;I)Lcom/sleepycat/db/DbLock;
 */
JNIEXPORT jobject JNICALL Java_com_sleepycat_db_DbEnv_lock_1get
  (JNIEnv *, jobject, jint, jint, jobject, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    lock_id
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_sleepycat_db_DbEnv_lock_1id
  (JNIEnv *, jobject);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    lock_stat
 * Signature: ()Lcom/sleepycat/db/DbLockStat;
 */
JNIEXPORT jobject JNICALL Java_com_sleepycat_db_DbEnv_lock_1stat
  (JNIEnv *, jobject);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    log_archive
 * Signature: (I)[Ljava/lang/String;
 */
JNIEXPORT jobjectArray JNICALL Java_com_sleepycat_db_DbEnv_log_1archive
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    log_compare
 * Signature: (Lcom/sleepycat/db/DbLsn;Lcom/sleepycat/db/DbLsn;)I
 */
JNIEXPORT jint JNICALL Java_com_sleepycat_db_DbEnv_log_1compare
  (JNIEnv *, jclass, jobject, jobject);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    log_file
 * Signature: (Lcom/sleepycat/db/DbLsn;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_sleepycat_db_DbEnv_log_1file
  (JNIEnv *, jobject, jobject);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    log_flush
 * Signature: (Lcom/sleepycat/db/DbLsn;)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_log_1flush
  (JNIEnv *, jobject, jobject);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    log_get
 * Signature: (Lcom/sleepycat/db/DbLsn;Lcom/sleepycat/db/Dbt;I)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_log_1get
  (JNIEnv *, jobject, jobject, jobject, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    log_put
 * Signature: (Lcom/sleepycat/db/DbLsn;Lcom/sleepycat/db/Dbt;I)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_log_1put
  (JNIEnv *, jobject, jobject, jobject, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    log_stat
 * Signature: ()Lcom/sleepycat/db/DbLogStat;
 */
JNIEXPORT jobject JNICALL Java_com_sleepycat_db_DbEnv_log_1stat
  (JNIEnv *, jobject);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    log_register
 * Signature: (Lcom/sleepycat/db/Db;Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_log_1register
  (JNIEnv *, jobject, jobject, jstring);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    log_unregister
 * Signature: (Lcom/sleepycat/db/Db;)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_log_1unregister
  (JNIEnv *, jobject, jobject);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    memp_stat
 * Signature: ()Lcom/sleepycat/db/DbMpoolStat;
 */
JNIEXPORT jobject JNICALL Java_com_sleepycat_db_DbEnv_memp_1stat
  (JNIEnv *, jobject);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    memp_fstat
 * Signature: ()[Lcom/sleepycat/db/DbMpoolFStat;
 */
JNIEXPORT jobjectArray JNICALL Java_com_sleepycat_db_DbEnv_memp_1fstat
  (JNIEnv *, jobject);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    memp_trickle
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_sleepycat_db_DbEnv_memp_1trickle
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    txn_begin
 * Signature: (Lcom/sleepycat/db/DbTxn;I)Lcom/sleepycat/db/DbTxn;
 */
JNIEXPORT jobject JNICALL Java_com_sleepycat_db_DbEnv_txn_1begin
  (JNIEnv *, jobject, jobject, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    txn_checkpoint
 * Signature: (III)V
 */
JNIEXPORT void JNICALL Java_com_sleepycat_db_DbEnv_txn_1checkpoint
  (JNIEnv *, jobject, jint, jint, jint);

/*
 * Class:     com_sleepycat_db_DbEnv
 * Method:    txn_stat
 * Signature: ()Lcom/sleepycat/db/DbTxnStat;
 */
JNIEXPORT jobject JNICALL Java_com_sleepycat_db_DbEnv_txn_1stat
  (JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
