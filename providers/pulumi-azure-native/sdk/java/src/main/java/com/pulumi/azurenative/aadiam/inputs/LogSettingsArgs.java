// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aadiam.inputs;

import com.pulumi.azurenative.aadiam.enums.Category;
import com.pulumi.azurenative.aadiam.inputs.RetentionPolicyArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Part of MultiTenantDiagnosticSettings. Specifies the settings for a particular log.
 * 
 */
public final class LogSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogSettingsArgs Empty = new LogSettingsArgs();

    /**
     * Name of a Diagnostic Log category for a resource type this setting is applied to. To obtain the list of Diagnostic Log categories for a resource, first perform a GET diagnostic settings operation.
     * 
     */
    @Import(name="category")
      private final @Nullable Output<Either<String,Category>> category;

    public Output<Either<String,Category>> category() {
        return this.category == null ? Codegen.empty() : this.category;
    }

    /**
     * A value indicating whether this log is enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The retention policy for this log.
     * 
     */
    @Import(name="retentionPolicy")
      private final @Nullable Output<RetentionPolicyArgs> retentionPolicy;

    public Output<RetentionPolicyArgs> retentionPolicy() {
        return this.retentionPolicy == null ? Codegen.empty() : this.retentionPolicy;
    }

    public LogSettingsArgs(
        @Nullable Output<Either<String,Category>> category,
        Output<Boolean> enabled,
        @Nullable Output<RetentionPolicyArgs> retentionPolicy) {
        this.category = category;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.retentionPolicy = retentionPolicy;
    }

    private LogSettingsArgs() {
        this.category = Codegen.empty();
        this.enabled = Codegen.empty();
        this.retentionPolicy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,Category>> category;
        private Output<Boolean> enabled;
        private @Nullable Output<RetentionPolicyArgs> retentionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(LogSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.enabled = defaults.enabled;
    	      this.retentionPolicy = defaults.retentionPolicy;
        }

        public Builder category(@Nullable Output<Either<String,Category>> category) {
            this.category = category;
            return this;
        }
        public Builder category(@Nullable Either<String,Category> category) {
            this.category = Codegen.ofNullable(category);
            return this;
        }
        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public Builder retentionPolicy(@Nullable Output<RetentionPolicyArgs> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }
        public Builder retentionPolicy(@Nullable RetentionPolicyArgs retentionPolicy) {
            this.retentionPolicy = Codegen.ofNullable(retentionPolicy);
            return this;
        }        public LogSettingsArgs build() {
            return new LogSettingsArgs(category, enabled, retentionPolicy);
        }
    }
}
