// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.azurenative.dataprotection.inputs.InnerErrorResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Error object used by layers that have access to localized content, and propagate that to user
 * 
 */
public final class UserFacingErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserFacingErrorResponse Empty = new UserFacingErrorResponse();

    /**
     * Unique code for this error
     * 
     */
    @Import(name="code")
      private final @Nullable String code;

    public Optional<String> code() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    /**
     * Additional related Errors
     * 
     */
    @Import(name="details")
      private final @Nullable List<UserFacingErrorResponse> details;

    public List<UserFacingErrorResponse> details() {
        return this.details == null ? List.of() : this.details;
    }

    /**
     * Inner Error
     * 
     */
    @Import(name="innerError")
      private final @Nullable InnerErrorResponse innerError;

    public Optional<InnerErrorResponse> innerError() {
        return this.innerError == null ? Optional.empty() : Optional.ofNullable(this.innerError);
    }

    /**
     * Whether the operation will be retryable or not
     * 
     */
    @Import(name="isRetryable")
      private final @Nullable Boolean isRetryable;

    public Optional<Boolean> isRetryable() {
        return this.isRetryable == null ? Optional.empty() : Optional.ofNullable(this.isRetryable);
    }

    /**
     * Whether the operation is due to a user error or service error
     * 
     */
    @Import(name="isUserError")
      private final @Nullable Boolean isUserError;

    public Optional<Boolean> isUserError() {
        return this.isUserError == null ? Optional.empty() : Optional.ofNullable(this.isUserError);
    }

    @Import(name="message")
      private final @Nullable String message;

    public Optional<String> message() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    /**
     * Any key value pairs that can be injected inside error object
     * 
     */
    @Import(name="properties")
      private final @Nullable Map<String,String> properties;

    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    /**
     * RecommendedAction � localized.
     * 
     */
    @Import(name="recommendedAction")
      private final @Nullable List<String> recommendedAction;

    public List<String> recommendedAction() {
        return this.recommendedAction == null ? List.of() : this.recommendedAction;
    }

    /**
     * Target of the error.
     * 
     */
    @Import(name="target")
      private final @Nullable String target;

    public Optional<String> target() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    public UserFacingErrorResponse(
        @Nullable String code,
        @Nullable List<UserFacingErrorResponse> details,
        @Nullable InnerErrorResponse innerError,
        @Nullable Boolean isRetryable,
        @Nullable Boolean isUserError,
        @Nullable String message,
        @Nullable Map<String,String> properties,
        @Nullable List<String> recommendedAction,
        @Nullable String target) {
        this.code = code;
        this.details = details;
        this.innerError = innerError;
        this.isRetryable = isRetryable;
        this.isUserError = isUserError;
        this.message = message;
        this.properties = properties;
        this.recommendedAction = recommendedAction;
        this.target = target;
    }

    private UserFacingErrorResponse() {
        this.code = null;
        this.details = List.of();
        this.innerError = null;
        this.isRetryable = null;
        this.isUserError = null;
        this.message = null;
        this.properties = Map.of();
        this.recommendedAction = List.of();
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserFacingErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable List<UserFacingErrorResponse> details;
        private @Nullable InnerErrorResponse innerError;
        private @Nullable Boolean isRetryable;
        private @Nullable Boolean isUserError;
        private @Nullable String message;
        private @Nullable Map<String,String> properties;
        private @Nullable List<String> recommendedAction;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(UserFacingErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.innerError = defaults.innerError;
    	      this.isRetryable = defaults.isRetryable;
    	      this.isUserError = defaults.isUserError;
    	      this.message = defaults.message;
    	      this.properties = defaults.properties;
    	      this.recommendedAction = defaults.recommendedAction;
    	      this.target = defaults.target;
        }

        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }
        public Builder details(@Nullable List<UserFacingErrorResponse> details) {
            this.details = details;
            return this;
        }
        public Builder details(UserFacingErrorResponse... details) {
            return details(List.of(details));
        }
        public Builder innerError(@Nullable InnerErrorResponse innerError) {
            this.innerError = innerError;
            return this;
        }
        public Builder isRetryable(@Nullable Boolean isRetryable) {
            this.isRetryable = isRetryable;
            return this;
        }
        public Builder isUserError(@Nullable Boolean isUserError) {
            this.isUserError = isUserError;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder recommendedAction(@Nullable List<String> recommendedAction) {
            this.recommendedAction = recommendedAction;
            return this;
        }
        public Builder recommendedAction(String... recommendedAction) {
            return recommendedAction(List.of(recommendedAction));
        }
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }        public UserFacingErrorResponse build() {
            return new UserFacingErrorResponse(code, details, innerError, isRetryable, isUserError, message, properties, recommendedAction, target);
        }
    }
}
