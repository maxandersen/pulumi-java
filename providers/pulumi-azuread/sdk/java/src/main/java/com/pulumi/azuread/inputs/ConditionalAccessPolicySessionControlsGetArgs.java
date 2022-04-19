// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConditionalAccessPolicySessionControlsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConditionalAccessPolicySessionControlsGetArgs Empty = new ConditionalAccessPolicySessionControlsGetArgs();

    /**
     * Whether or not application enforced restrictions are enabled. Defaults to `false`.
     * 
     */
    @Import(name="applicationEnforcedRestrictionsEnabled")
      private final @Nullable Output<Boolean> applicationEnforcedRestrictionsEnabled;

    public Output<Boolean> applicationEnforcedRestrictionsEnabled() {
        return this.applicationEnforcedRestrictionsEnabled == null ? Codegen.empty() : this.applicationEnforcedRestrictionsEnabled;
    }

    /**
     * Enables cloud app security and specifies the cloud app security policy to use. Possible values are: `blockDownloads`, `mcasConfigured`, `monitorOnly` or `unknownFutureValue`.
     * 
     */
    @Import(name="cloudAppSecurityPolicy")
      private final @Nullable Output<String> cloudAppSecurityPolicy;

    public Output<String> cloudAppSecurityPolicy() {
        return this.cloudAppSecurityPolicy == null ? Codegen.empty() : this.cloudAppSecurityPolicy;
    }

    /**
     * Session control to define whether to persist cookies or not. Possible values are: `always` or `never`.
     * 
     */
    @Import(name="persistentBrowserMode")
      private final @Nullable Output<String> persistentBrowserMode;

    public Output<String> persistentBrowserMode() {
        return this.persistentBrowserMode == null ? Codegen.empty() : this.persistentBrowserMode;
    }

    /**
     * Number of days or hours to enforce sign-in frequency. Required when `sign_in_frequency_period` is specified. Due to an API issue, removing this property forces a new resource to be created.
     * 
     */
    @Import(name="signInFrequency")
      private final @Nullable Output<Integer> signInFrequency;

    public Output<Integer> signInFrequency() {
        return this.signInFrequency == null ? Codegen.empty() : this.signInFrequency;
    }

    /**
     * The time period to enforce sign-in frequency. Possible values are: `hours` or `days`. Required when `sign_in_frequency_period` is specified. Due to an API issue, removing this property forces a new resource to be created.
     * 
     */
    @Import(name="signInFrequencyPeriod")
      private final @Nullable Output<String> signInFrequencyPeriod;

    public Output<String> signInFrequencyPeriod() {
        return this.signInFrequencyPeriod == null ? Codegen.empty() : this.signInFrequencyPeriod;
    }

    public ConditionalAccessPolicySessionControlsGetArgs(
        @Nullable Output<Boolean> applicationEnforcedRestrictionsEnabled,
        @Nullable Output<String> cloudAppSecurityPolicy,
        @Nullable Output<String> persistentBrowserMode,
        @Nullable Output<Integer> signInFrequency,
        @Nullable Output<String> signInFrequencyPeriod) {
        this.applicationEnforcedRestrictionsEnabled = applicationEnforcedRestrictionsEnabled;
        this.cloudAppSecurityPolicy = cloudAppSecurityPolicy;
        this.persistentBrowserMode = persistentBrowserMode;
        this.signInFrequency = signInFrequency;
        this.signInFrequencyPeriod = signInFrequencyPeriod;
    }

    private ConditionalAccessPolicySessionControlsGetArgs() {
        this.applicationEnforcedRestrictionsEnabled = Codegen.empty();
        this.cloudAppSecurityPolicy = Codegen.empty();
        this.persistentBrowserMode = Codegen.empty();
        this.signInFrequency = Codegen.empty();
        this.signInFrequencyPeriod = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionalAccessPolicySessionControlsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> applicationEnforcedRestrictionsEnabled;
        private @Nullable Output<String> cloudAppSecurityPolicy;
        private @Nullable Output<String> persistentBrowserMode;
        private @Nullable Output<Integer> signInFrequency;
        private @Nullable Output<String> signInFrequencyPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionalAccessPolicySessionControlsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationEnforcedRestrictionsEnabled = defaults.applicationEnforcedRestrictionsEnabled;
    	      this.cloudAppSecurityPolicy = defaults.cloudAppSecurityPolicy;
    	      this.persistentBrowserMode = defaults.persistentBrowserMode;
    	      this.signInFrequency = defaults.signInFrequency;
    	      this.signInFrequencyPeriod = defaults.signInFrequencyPeriod;
        }

        public Builder applicationEnforcedRestrictionsEnabled(@Nullable Output<Boolean> applicationEnforcedRestrictionsEnabled) {
            this.applicationEnforcedRestrictionsEnabled = applicationEnforcedRestrictionsEnabled;
            return this;
        }
        public Builder applicationEnforcedRestrictionsEnabled(@Nullable Boolean applicationEnforcedRestrictionsEnabled) {
            this.applicationEnforcedRestrictionsEnabled = Codegen.ofNullable(applicationEnforcedRestrictionsEnabled);
            return this;
        }
        public Builder cloudAppSecurityPolicy(@Nullable Output<String> cloudAppSecurityPolicy) {
            this.cloudAppSecurityPolicy = cloudAppSecurityPolicy;
            return this;
        }
        public Builder cloudAppSecurityPolicy(@Nullable String cloudAppSecurityPolicy) {
            this.cloudAppSecurityPolicy = Codegen.ofNullable(cloudAppSecurityPolicy);
            return this;
        }
        public Builder persistentBrowserMode(@Nullable Output<String> persistentBrowserMode) {
            this.persistentBrowserMode = persistentBrowserMode;
            return this;
        }
        public Builder persistentBrowserMode(@Nullable String persistentBrowserMode) {
            this.persistentBrowserMode = Codegen.ofNullable(persistentBrowserMode);
            return this;
        }
        public Builder signInFrequency(@Nullable Output<Integer> signInFrequency) {
            this.signInFrequency = signInFrequency;
            return this;
        }
        public Builder signInFrequency(@Nullable Integer signInFrequency) {
            this.signInFrequency = Codegen.ofNullable(signInFrequency);
            return this;
        }
        public Builder signInFrequencyPeriod(@Nullable Output<String> signInFrequencyPeriod) {
            this.signInFrequencyPeriod = signInFrequencyPeriod;
            return this;
        }
        public Builder signInFrequencyPeriod(@Nullable String signInFrequencyPeriod) {
            this.signInFrequencyPeriod = Codegen.ofNullable(signInFrequencyPeriod);
            return this;
        }        public ConditionalAccessPolicySessionControlsGetArgs build() {
            return new ConditionalAccessPolicySessionControlsGetArgs(applicationEnforcedRestrictionsEnabled, cloudAppSecurityPolicy, persistentBrowserMode, signInFrequency, signInFrequencyPeriod);
        }
    }
}
