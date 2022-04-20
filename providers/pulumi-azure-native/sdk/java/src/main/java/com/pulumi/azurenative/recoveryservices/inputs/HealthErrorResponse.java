// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.InnerHealthErrorResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Health Error
 * 
 */
public final class HealthErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final HealthErrorResponse Empty = new HealthErrorResponse();

    /**
     * Error creation time (UTC)
     * 
     */
    @Import(name="creationTimeUtc")
      private final @Nullable String creationTimeUtc;

    public Optional<String> creationTimeUtc() {
        return this.creationTimeUtc == null ? Optional.empty() : Optional.ofNullable(this.creationTimeUtc);
    }

    /**
     * Value indicating whether the health error is customer resolvable.
     * 
     */
    @Import(name="customerResolvability")
      private final @Nullable String customerResolvability;

    public Optional<String> customerResolvability() {
        return this.customerResolvability == null ? Optional.empty() : Optional.ofNullable(this.customerResolvability);
    }

    /**
     * ID of the entity.
     * 
     */
    @Import(name="entityId")
      private final @Nullable String entityId;

    public Optional<String> entityId() {
        return this.entityId == null ? Optional.empty() : Optional.ofNullable(this.entityId);
    }

    /**
     * Category of error.
     * 
     */
    @Import(name="errorCategory")
      private final @Nullable String errorCategory;

    public Optional<String> errorCategory() {
        return this.errorCategory == null ? Optional.empty() : Optional.ofNullable(this.errorCategory);
    }

    /**
     * Error code.
     * 
     */
    @Import(name="errorCode")
      private final @Nullable String errorCode;

    public Optional<String> errorCode() {
        return this.errorCode == null ? Optional.empty() : Optional.ofNullable(this.errorCode);
    }

    /**
     * The health error unique id.
     * 
     */
    @Import(name="errorId")
      private final @Nullable String errorId;

    public Optional<String> errorId() {
        return this.errorId == null ? Optional.empty() : Optional.ofNullable(this.errorId);
    }

    /**
     * Level of error.
     * 
     */
    @Import(name="errorLevel")
      private final @Nullable String errorLevel;

    public Optional<String> errorLevel() {
        return this.errorLevel == null ? Optional.empty() : Optional.ofNullable(this.errorLevel);
    }

    /**
     * Error message.
     * 
     */
    @Import(name="errorMessage")
      private final @Nullable String errorMessage;

    public Optional<String> errorMessage() {
        return this.errorMessage == null ? Optional.empty() : Optional.ofNullable(this.errorMessage);
    }

    /**
     * Source of error.
     * 
     */
    @Import(name="errorSource")
      private final @Nullable String errorSource;

    public Optional<String> errorSource() {
        return this.errorSource == null ? Optional.empty() : Optional.ofNullable(this.errorSource);
    }

    /**
     * Type of error.
     * 
     */
    @Import(name="errorType")
      private final @Nullable String errorType;

    public Optional<String> errorType() {
        return this.errorType == null ? Optional.empty() : Optional.ofNullable(this.errorType);
    }

    /**
     * The inner health errors. HealthError having a list of HealthError as child errors is problematic. InnerHealthError is used because this will prevent an infinite loop of structures when Hydra tries to auto-generate the contract. We are exposing the related health errors as inner health errors and all API consumers can utilize this in the same fashion as Exception -&amp;gt; InnerException.
     * 
     */
    @Import(name="innerHealthErrors")
      private final @Nullable List<InnerHealthErrorResponse> innerHealthErrors;

    public List<InnerHealthErrorResponse> innerHealthErrors() {
        return this.innerHealthErrors == null ? List.of() : this.innerHealthErrors;
    }

    /**
     * Possible causes of error.
     * 
     */
    @Import(name="possibleCauses")
      private final @Nullable String possibleCauses;

    public Optional<String> possibleCauses() {
        return this.possibleCauses == null ? Optional.empty() : Optional.ofNullable(this.possibleCauses);
    }

    /**
     * Recommended action to resolve error.
     * 
     */
    @Import(name="recommendedAction")
      private final @Nullable String recommendedAction;

    public Optional<String> recommendedAction() {
        return this.recommendedAction == null ? Optional.empty() : Optional.ofNullable(this.recommendedAction);
    }

    /**
     * DRA error message.
     * 
     */
    @Import(name="recoveryProviderErrorMessage")
      private final @Nullable String recoveryProviderErrorMessage;

    public Optional<String> recoveryProviderErrorMessage() {
        return this.recoveryProviderErrorMessage == null ? Optional.empty() : Optional.ofNullable(this.recoveryProviderErrorMessage);
    }

    /**
     * Summary message of the entity.
     * 
     */
    @Import(name="summaryMessage")
      private final @Nullable String summaryMessage;

    public Optional<String> summaryMessage() {
        return this.summaryMessage == null ? Optional.empty() : Optional.ofNullable(this.summaryMessage);
    }

    public HealthErrorResponse(
        @Nullable String creationTimeUtc,
        @Nullable String customerResolvability,
        @Nullable String entityId,
        @Nullable String errorCategory,
        @Nullable String errorCode,
        @Nullable String errorId,
        @Nullable String errorLevel,
        @Nullable String errorMessage,
        @Nullable String errorSource,
        @Nullable String errorType,
        @Nullable List<InnerHealthErrorResponse> innerHealthErrors,
        @Nullable String possibleCauses,
        @Nullable String recommendedAction,
        @Nullable String recoveryProviderErrorMessage,
        @Nullable String summaryMessage) {
        this.creationTimeUtc = creationTimeUtc;
        this.customerResolvability = customerResolvability;
        this.entityId = entityId;
        this.errorCategory = errorCategory;
        this.errorCode = errorCode;
        this.errorId = errorId;
        this.errorLevel = errorLevel;
        this.errorMessage = errorMessage;
        this.errorSource = errorSource;
        this.errorType = errorType;
        this.innerHealthErrors = innerHealthErrors;
        this.possibleCauses = possibleCauses;
        this.recommendedAction = recommendedAction;
        this.recoveryProviderErrorMessage = recoveryProviderErrorMessage;
        this.summaryMessage = summaryMessage;
    }

    private HealthErrorResponse() {
        this.creationTimeUtc = null;
        this.customerResolvability = null;
        this.entityId = null;
        this.errorCategory = null;
        this.errorCode = null;
        this.errorId = null;
        this.errorLevel = null;
        this.errorMessage = null;
        this.errorSource = null;
        this.errorType = null;
        this.innerHealthErrors = List.of();
        this.possibleCauses = null;
        this.recommendedAction = null;
        this.recoveryProviderErrorMessage = null;
        this.summaryMessage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTimeUtc;
        private @Nullable String customerResolvability;
        private @Nullable String entityId;
        private @Nullable String errorCategory;
        private @Nullable String errorCode;
        private @Nullable String errorId;
        private @Nullable String errorLevel;
        private @Nullable String errorMessage;
        private @Nullable String errorSource;
        private @Nullable String errorType;
        private @Nullable List<InnerHealthErrorResponse> innerHealthErrors;
        private @Nullable String possibleCauses;
        private @Nullable String recommendedAction;
        private @Nullable String recoveryProviderErrorMessage;
        private @Nullable String summaryMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimeUtc = defaults.creationTimeUtc;
    	      this.customerResolvability = defaults.customerResolvability;
    	      this.entityId = defaults.entityId;
    	      this.errorCategory = defaults.errorCategory;
    	      this.errorCode = defaults.errorCode;
    	      this.errorId = defaults.errorId;
    	      this.errorLevel = defaults.errorLevel;
    	      this.errorMessage = defaults.errorMessage;
    	      this.errorSource = defaults.errorSource;
    	      this.errorType = defaults.errorType;
    	      this.innerHealthErrors = defaults.innerHealthErrors;
    	      this.possibleCauses = defaults.possibleCauses;
    	      this.recommendedAction = defaults.recommendedAction;
    	      this.recoveryProviderErrorMessage = defaults.recoveryProviderErrorMessage;
    	      this.summaryMessage = defaults.summaryMessage;
        }

        public Builder creationTimeUtc(@Nullable String creationTimeUtc) {
            this.creationTimeUtc = creationTimeUtc;
            return this;
        }
        public Builder customerResolvability(@Nullable String customerResolvability) {
            this.customerResolvability = customerResolvability;
            return this;
        }
        public Builder entityId(@Nullable String entityId) {
            this.entityId = entityId;
            return this;
        }
        public Builder errorCategory(@Nullable String errorCategory) {
            this.errorCategory = errorCategory;
            return this;
        }
        public Builder errorCode(@Nullable String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public Builder errorId(@Nullable String errorId) {
            this.errorId = errorId;
            return this;
        }
        public Builder errorLevel(@Nullable String errorLevel) {
            this.errorLevel = errorLevel;
            return this;
        }
        public Builder errorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public Builder errorSource(@Nullable String errorSource) {
            this.errorSource = errorSource;
            return this;
        }
        public Builder errorType(@Nullable String errorType) {
            this.errorType = errorType;
            return this;
        }
        public Builder innerHealthErrors(@Nullable List<InnerHealthErrorResponse> innerHealthErrors) {
            this.innerHealthErrors = innerHealthErrors;
            return this;
        }
        public Builder innerHealthErrors(InnerHealthErrorResponse... innerHealthErrors) {
            return innerHealthErrors(List.of(innerHealthErrors));
        }
        public Builder possibleCauses(@Nullable String possibleCauses) {
            this.possibleCauses = possibleCauses;
            return this;
        }
        public Builder recommendedAction(@Nullable String recommendedAction) {
            this.recommendedAction = recommendedAction;
            return this;
        }
        public Builder recoveryProviderErrorMessage(@Nullable String recoveryProviderErrorMessage) {
            this.recoveryProviderErrorMessage = recoveryProviderErrorMessage;
            return this;
        }
        public Builder summaryMessage(@Nullable String summaryMessage) {
            this.summaryMessage = summaryMessage;
            return this;
        }        public HealthErrorResponse build() {
            return new HealthErrorResponse(creationTimeUtc, customerResolvability, entityId, errorCategory, errorCode, errorId, errorLevel, errorMessage, errorSource, errorType, innerHealthErrors, possibleCauses, recommendedAction, recoveryProviderErrorMessage, summaryMessage);
        }
    }
}
