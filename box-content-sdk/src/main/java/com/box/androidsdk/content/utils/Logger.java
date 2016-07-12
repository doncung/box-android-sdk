package com.box.androidsdk.content.utils;

import java.util.Map;

/**
 * Interface supporting logging for box sdks
 */

public interface Logger {

    /**
     *  @return true if logging is currently enabled.
     */
    public boolean getIsLoggingEnabled();

    /**
     * Info logs.
     * @param tag
     * @param msg
     */
    public void i(String tag, String msg);

    /**
     * Info logs with key-value pairs
     * @param tag
     * @param msg
     * @param map
     */
    public void i(String tag, String msg, Map<String, String> map);

    /**
     * Debug logs
     * @param tag
     * @param msg
     */
    public void d(String tag, String msg);

    /**
     * Error logs
     * @param tag
     * @param msg
     */
    public void e(String tag, String msg);

    /**
     * Error log with throwable
     * @param tag
     * @param t
     */
    public void e(String tag, Throwable t);

    /**
     * Error log with throwable and message.
     * @param tag
     * @param msg
     * @param t
     */
    public void e(String tag, String msg, Throwable t);

    /**
     * Use for logging non fatal errors
     * May be used for debugging with stack traces.
     * @param tag
     * @param msg
     * @param t
     */
    public void nonFatalE(String tag, String msg, Throwable t);
}
