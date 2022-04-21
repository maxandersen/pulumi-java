// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.websecurityscanner_v1beta.inputs.ScanConfigErrorResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Output only. Defines an error trace message for a ScanRun.
 * 
 */
public final class ScanRunErrorTraceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScanRunErrorTraceResponse Empty = new ScanRunErrorTraceResponse();

    /**
     * Indicates the error reason code.
     * 
     */
    @Import(name="code", required=true)
    private String code;

    public String code() {
        return this.code;
    }

    /**
     * If the scan encounters TOO_MANY_HTTP_ERRORS, this field indicates the most common HTTP error code, if such is available. For example, if this code is 404, the scan has encountered too many NOT_FOUND responses.
     * 
     */
    @Import(name="mostCommonHttpErrorCode", required=true)
    private Integer mostCommonHttpErrorCode;

    public Integer mostCommonHttpErrorCode() {
        return this.mostCommonHttpErrorCode;
    }

    /**
     * If the scan encounters SCAN_CONFIG_ISSUE error, this field has the error message encountered during scan configuration validation that is performed before each scan run.
     * 
     */
    @Import(name="scanConfigError", required=true)
    private ScanConfigErrorResponse scanConfigError;

    public ScanConfigErrorResponse scanConfigError() {
        return this.scanConfigError;
    }

    private ScanRunErrorTraceResponse() {}

    private ScanRunErrorTraceResponse(ScanRunErrorTraceResponse $) {
        this.code = $.code;
        this.mostCommonHttpErrorCode = $.mostCommonHttpErrorCode;
        this.scanConfigError = $.scanConfigError;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScanRunErrorTraceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScanRunErrorTraceResponse $;

        public Builder() {
            $ = new ScanRunErrorTraceResponse();
        }

        public Builder(ScanRunErrorTraceResponse defaults) {
            $ = new ScanRunErrorTraceResponse(Objects.requireNonNull(defaults));
        }

        public Builder code(String code) {
            $.code = code;
            return this;
        }

        public Builder mostCommonHttpErrorCode(Integer mostCommonHttpErrorCode) {
            $.mostCommonHttpErrorCode = mostCommonHttpErrorCode;
            return this;
        }

        public Builder scanConfigError(ScanConfigErrorResponse scanConfigError) {
            $.scanConfigError = scanConfigError;
            return this;
        }

        public ScanRunErrorTraceResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.mostCommonHttpErrorCode = Objects.requireNonNull($.mostCommonHttpErrorCode, "expected parameter 'mostCommonHttpErrorCode' to be non-null");
            $.scanConfigError = Objects.requireNonNull($.scanConfigError, "expected parameter 'scanConfigError' to be non-null");
            return $;
        }
    }

}
