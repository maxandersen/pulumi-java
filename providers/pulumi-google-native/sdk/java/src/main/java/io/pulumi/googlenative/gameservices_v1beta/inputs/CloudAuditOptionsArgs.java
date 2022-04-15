// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.gameservices_v1beta.enums.CloudAuditOptionsLogName;
import io.pulumi.googlenative.gameservices_v1beta.inputs.AuthorizationLoggingOptionsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Write a Cloud Audit log
 * 
 */
public final class CloudAuditOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudAuditOptionsArgs Empty = new CloudAuditOptionsArgs();

    /**
     * Information used by the Cloud Audit Logging pipeline.
     * 
     */
    @Import(name="authorizationLoggingOptions")
      private final @Nullable Output<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions;

    public Output<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions() {
        return this.authorizationLoggingOptions == null ? Codegen.empty() : this.authorizationLoggingOptions;
    }

    /**
     * The log_name to populate in the Cloud Audit Record.
     * 
     */
    @Import(name="logName")
      private final @Nullable Output<CloudAuditOptionsLogName> logName;

    public Output<CloudAuditOptionsLogName> logName() {
        return this.logName == null ? Codegen.empty() : this.logName;
    }

    public CloudAuditOptionsArgs(
        @Nullable Output<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions,
        @Nullable Output<CloudAuditOptionsLogName> logName) {
        this.authorizationLoggingOptions = authorizationLoggingOptions;
        this.logName = logName;
    }

    private CloudAuditOptionsArgs() {
        this.authorizationLoggingOptions = Codegen.empty();
        this.logName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudAuditOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions;
        private @Nullable Output<CloudAuditOptionsLogName> logName;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudAuditOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationLoggingOptions = defaults.authorizationLoggingOptions;
    	      this.logName = defaults.logName;
        }

        public Builder authorizationLoggingOptions(@Nullable Output<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions) {
            this.authorizationLoggingOptions = authorizationLoggingOptions;
            return this;
        }
        public Builder authorizationLoggingOptions(@Nullable AuthorizationLoggingOptionsArgs authorizationLoggingOptions) {
            this.authorizationLoggingOptions = Codegen.ofNullable(authorizationLoggingOptions);
            return this;
        }
        public Builder logName(@Nullable Output<CloudAuditOptionsLogName> logName) {
            this.logName = logName;
            return this;
        }
        public Builder logName(@Nullable CloudAuditOptionsLogName logName) {
            this.logName = Codegen.ofNullable(logName);
            return this;
        }        public CloudAuditOptionsArgs build() {
            return new CloudAuditOptionsArgs(authorizationLoggingOptions, logName);
        }
    }
}
