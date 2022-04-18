// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.AuthorizationLoggingOptionsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigCloudAuditOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final LogConfigCloudAuditOptionsResponse Empty = new LogConfigCloudAuditOptionsResponse();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="authorizationLoggingOptions", required=true)
      private final AuthorizationLoggingOptionsResponse authorizationLoggingOptions;

    public AuthorizationLoggingOptionsResponse authorizationLoggingOptions() {
        return this.authorizationLoggingOptions;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="logName", required=true)
      private final String logName;

    public String logName() {
        return this.logName;
    }

    public LogConfigCloudAuditOptionsResponse(
        AuthorizationLoggingOptionsResponse authorizationLoggingOptions,
        String logName) {
        this.authorizationLoggingOptions = Objects.requireNonNull(authorizationLoggingOptions, "expected parameter 'authorizationLoggingOptions' to be non-null");
        this.logName = Objects.requireNonNull(logName, "expected parameter 'logName' to be non-null");
    }

    private LogConfigCloudAuditOptionsResponse() {
        this.authorizationLoggingOptions = null;
        this.logName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigCloudAuditOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorizationLoggingOptionsResponse authorizationLoggingOptions;
        private String logName;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigCloudAuditOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationLoggingOptions = defaults.authorizationLoggingOptions;
    	      this.logName = defaults.logName;
        }

        public Builder authorizationLoggingOptions(AuthorizationLoggingOptionsResponse authorizationLoggingOptions) {
            this.authorizationLoggingOptions = Objects.requireNonNull(authorizationLoggingOptions);
            return this;
        }
        public Builder logName(String logName) {
            this.logName = Objects.requireNonNull(logName);
            return this;
        }        public LogConfigCloudAuditOptionsResponse build() {
            return new LogConfigCloudAuditOptionsResponse(authorizationLoggingOptions, logName);
        }
    }
}
