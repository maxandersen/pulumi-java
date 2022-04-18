// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestack.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CompatibilityResponse {
    /**
     * Full error message if any compatibility issues are found
     * 
     */
    private final @Nullable String description;
    /**
     * Tells if product is compatible with current device
     * 
     */
    private final @Nullable Boolean isCompatible;
    /**
     * List of all issues found
     * 
     */
    private final @Nullable List<String> issues;
    /**
     * Short error message if any compatibility issues are found
     * 
     */
    private final @Nullable String message;

    @CustomType.Constructor
    private CompatibilityResponse(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("isCompatible") @Nullable Boolean isCompatible,
        @CustomType.Parameter("issues") @Nullable List<String> issues,
        @CustomType.Parameter("message") @Nullable String message) {
        this.description = description;
        this.isCompatible = isCompatible;
        this.issues = issues;
        this.message = message;
    }

    /**
     * Full error message if any compatibility issues are found
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Tells if product is compatible with current device
     * 
    */
    public Optional<Boolean> isCompatible() {
        return Optional.ofNullable(this.isCompatible);
    }
    /**
     * List of all issues found
     * 
    */
    public List<String> issues() {
        return this.issues == null ? List.of() : this.issues;
    }
    /**
     * Short error message if any compatibility issues are found
     * 
    */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompatibilityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Boolean isCompatible;
        private @Nullable List<String> issues;
        private @Nullable String message;

        public Builder() {
    	      // Empty
        }

        public Builder(CompatibilityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.isCompatible = defaults.isCompatible;
    	      this.issues = defaults.issues;
    	      this.message = defaults.message;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder isCompatible(@Nullable Boolean isCompatible) {
            this.isCompatible = isCompatible;
            return this;
        }
        public Builder issues(@Nullable List<String> issues) {
            this.issues = issues;
            return this;
        }
        public Builder issues(String... issues) {
            return issues(List.of(issues));
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }        public CompatibilityResponse build() {
            return new CompatibilityResponse(description, isCompatible, issues, message);
        }
    }
}
