// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.apigateway_v1.enums.ApigatewayAuditLogConfigLogType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Provides the configuration for logging a type of permissions. Example: { "audit_log_configs": [ { "log_type": "DATA_READ", "exempted_members": [ "user:jose@example.com" ] }, { "log_type": "DATA_WRITE" } ] } This enables 'DATA_READ' and 'DATA_WRITE' logging, while exempting jose@example.com from DATA_READ logging.
 * 
 */
public final class ApigatewayAuditLogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApigatewayAuditLogConfigArgs Empty = new ApigatewayAuditLogConfigArgs();

    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
     */
    @Import(name="exemptedMembers")
      private final @Nullable Output<List<String>> exemptedMembers;

    public Output<List<String>> exemptedMembers() {
        return this.exemptedMembers == null ? Codegen.empty() : this.exemptedMembers;
    }

    /**
     * The log type that this config enables.
     * 
     */
    @Import(name="logType")
      private final @Nullable Output<ApigatewayAuditLogConfigLogType> logType;

    public Output<ApigatewayAuditLogConfigLogType> logType() {
        return this.logType == null ? Codegen.empty() : this.logType;
    }

    public ApigatewayAuditLogConfigArgs(
        @Nullable Output<List<String>> exemptedMembers,
        @Nullable Output<ApigatewayAuditLogConfigLogType> logType) {
        this.exemptedMembers = exemptedMembers;
        this.logType = logType;
    }

    private ApigatewayAuditLogConfigArgs() {
        this.exemptedMembers = Codegen.empty();
        this.logType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayAuditLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> exemptedMembers;
        private @Nullable Output<ApigatewayAuditLogConfigLogType> logType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayAuditLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.logType = defaults.logType;
        }

        public Builder exemptedMembers(@Nullable Output<List<String>> exemptedMembers) {
            this.exemptedMembers = exemptedMembers;
            return this;
        }
        public Builder exemptedMembers(@Nullable List<String> exemptedMembers) {
            this.exemptedMembers = Codegen.ofNullable(exemptedMembers);
            return this;
        }
        public Builder exemptedMembers(String... exemptedMembers) {
            return exemptedMembers(List.of(exemptedMembers));
        }
        public Builder logType(@Nullable Output<ApigatewayAuditLogConfigLogType> logType) {
            this.logType = logType;
            return this;
        }
        public Builder logType(@Nullable ApigatewayAuditLogConfigLogType logType) {
            this.logType = Codegen.ofNullable(logType);
            return this;
        }        public ApigatewayAuditLogConfigArgs build() {
            return new ApigatewayAuditLogConfigArgs(exemptedMembers, logType);
        }
    }
}
