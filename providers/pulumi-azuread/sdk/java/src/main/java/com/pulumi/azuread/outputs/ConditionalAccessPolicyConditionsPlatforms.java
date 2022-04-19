// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ConditionalAccessPolicyConditionsPlatforms {
    /**
     * A list of platforms explicitly excluded from the policy. Possible values are: `all`, `android`, `iOS`, `macOS`, `windows`, `windowsPhone` or `unknownFutureValue`.
     * 
     */
    private final @Nullable List<String> excludedPlatforms;
    /**
     * A list of platforms the policy applies to, unless explicitly excluded. Possible values are: `all`, `android`, `iOS`, `macOS`, `windows`, `windowsPhone` or `unknownFutureValue`.
     * 
     */
    private final List<String> includedPlatforms;

    @CustomType.Constructor
    private ConditionalAccessPolicyConditionsPlatforms(
        @CustomType.Parameter("excludedPlatforms") @Nullable List<String> excludedPlatforms,
        @CustomType.Parameter("includedPlatforms") List<String> includedPlatforms) {
        this.excludedPlatforms = excludedPlatforms;
        this.includedPlatforms = includedPlatforms;
    }

    /**
     * A list of platforms explicitly excluded from the policy. Possible values are: `all`, `android`, `iOS`, `macOS`, `windows`, `windowsPhone` or `unknownFutureValue`.
     * 
    */
    public List<String> excludedPlatforms() {
        return this.excludedPlatforms == null ? List.of() : this.excludedPlatforms;
    }
    /**
     * A list of platforms the policy applies to, unless explicitly excluded. Possible values are: `all`, `android`, `iOS`, `macOS`, `windows`, `windowsPhone` or `unknownFutureValue`.
     * 
    */
    public List<String> includedPlatforms() {
        return this.includedPlatforms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionalAccessPolicyConditionsPlatforms defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludedPlatforms;
        private List<String> includedPlatforms;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionalAccessPolicyConditionsPlatforms defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedPlatforms = defaults.excludedPlatforms;
    	      this.includedPlatforms = defaults.includedPlatforms;
        }

        public Builder excludedPlatforms(@Nullable List<String> excludedPlatforms) {
            this.excludedPlatforms = excludedPlatforms;
            return this;
        }
        public Builder excludedPlatforms(String... excludedPlatforms) {
            return excludedPlatforms(List.of(excludedPlatforms));
        }
        public Builder includedPlatforms(List<String> includedPlatforms) {
            this.includedPlatforms = Objects.requireNonNull(includedPlatforms);
            return this;
        }
        public Builder includedPlatforms(String... includedPlatforms) {
            return includedPlatforms(List.of(includedPlatforms));
        }        public ConditionalAccessPolicyConditionsPlatforms build() {
            return new ConditionalAccessPolicyConditionsPlatforms(excludedPlatforms, includedPlatforms);
        }
    }
}
