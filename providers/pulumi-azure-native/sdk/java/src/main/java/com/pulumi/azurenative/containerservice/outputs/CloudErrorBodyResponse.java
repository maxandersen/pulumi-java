// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudErrorBodyResponse {
    /**
     * An identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     * 
     */
    private final @Nullable String code;
    /**
     * A list of additional details about the error.
     * 
     */
    private final @Nullable List<CloudErrorBodyResponse> details;
    /**
     * A message describing the error, intended to be suitable for display in a user interface.
     * 
     */
    private final @Nullable String message;
    /**
     * The target of the particular error. For example, the name of the property in error.
     * 
     */
    private final @Nullable String target;

    @CustomType.Constructor
    private CloudErrorBodyResponse(
        @CustomType.Parameter("code") @Nullable String code,
        @CustomType.Parameter("details") @Nullable List<CloudErrorBodyResponse> details,
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("target") @Nullable String target) {
        this.code = code;
        this.details = details;
        this.message = message;
        this.target = target;
    }

    /**
     * An identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     * 
    */
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }
    /**
     * A list of additional details about the error.
     * 
    */
    public List<CloudErrorBodyResponse> details() {
        return this.details == null ? List.of() : this.details;
    }
    /**
     * A message describing the error, intended to be suitable for display in a user interface.
     * 
    */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * The target of the particular error. For example, the name of the property in error.
     * 
    */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudErrorBodyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable List<CloudErrorBodyResponse> details;
        private @Nullable String message;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudErrorBodyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }
        public Builder details(@Nullable List<CloudErrorBodyResponse> details) {
            this.details = details;
            return this;
        }
        public Builder details(CloudErrorBodyResponse... details) {
            return details(List.of(details));
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }        public CloudErrorBodyResponse build() {
            return new CloudErrorBodyResponse(code, details, message, target);
        }
    }
}
