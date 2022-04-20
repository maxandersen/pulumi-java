// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.gkehub_v1alpha2.enums.AuditLogConfigLogType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Provides the configuration for logging a type of permissions. Example: { &#34;audit_log_configs&#34;: [ { &#34;log_type&#34;: &#34;DATA_READ&#34;, &#34;exempted_members&#34;: [ &#34;user:jose@example.com&#34; ] }, { &#34;log_type&#34;: &#34;DATA_WRITE&#34; } ] } This enables &#39;DATA_READ&#39; and &#39;DATA_WRITE&#39; logging, while exempting jose@example.com from DATA_READ logging.
 * 
 */
public final class AuditLogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuditLogConfigArgs Empty = new AuditLogConfigArgs();

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
      private final @Nullable Output<AuditLogConfigLogType> logType;

    public Output<AuditLogConfigLogType> logType() {
        return this.logType == null ? Codegen.empty() : this.logType;
    }

    public AuditLogConfigArgs(
        @Nullable Output<List<String>> exemptedMembers,
        @Nullable Output<AuditLogConfigLogType> logType) {
        this.exemptedMembers = exemptedMembers;
        this.logType = logType;
    }

    private AuditLogConfigArgs() {
        this.exemptedMembers = Codegen.empty();
        this.logType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuditLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> exemptedMembers;
        private @Nullable Output<AuditLogConfigLogType> logType;

        public Builder() {
    	      // Empty
        }

        public Builder(AuditLogConfigArgs defaults) {
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
        public Builder logType(@Nullable Output<AuditLogConfigLogType> logType) {
            this.logType = logType;
            return this;
        }
        public Builder logType(@Nullable AuditLogConfigLogType logType) {
            this.logType = Codegen.ofNullable(logType);
            return this;
        }        public AuditLogConfigArgs build() {
            return new AuditLogConfigArgs(exemptedMembers, logType);
        }
    }
}
