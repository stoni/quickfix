/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class quickfix_OdbcLogFactory */

#ifndef _Included_quickfix_OdbcLogFactory
#define _Included_quickfix_OdbcLogFactory
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     quickfix_OdbcLogFactory
 * Method:    _create
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_quickfix_OdbcLogFactory__1create
  (JNIEnv *, jobject);

/*
 * Class:     quickfix_OdbcLogFactory
 * Method:    _destroy
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_quickfix_OdbcLogFactory__1destroy
  (JNIEnv *, jobject);

/*
 * Class:     quickfix_OdbcLogFactory
 * Method:    create
 * Signature: ()Lquickfix/Log;
 */
JNIEXPORT jobject JNICALL Java_quickfix_OdbcLogFactory_create__
  (JNIEnv *, jobject);

/*
 * Class:     quickfix_OdbcLogFactory
 * Method:    create
 * Signature: (Lquickfix/SessionID;)Lquickfix/Log;
 */
JNIEXPORT jobject JNICALL Java_quickfix_OdbcLogFactory_create__Lquickfix_SessionID_2
  (JNIEnv *, jobject, jobject);

#ifdef __cplusplus
}
#endif
#endif
