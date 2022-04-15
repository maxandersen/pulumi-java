// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class InMageRcmAgentUpgradeBlockingErrorDetailsResponse {
    /**
     * The error code.
     * 
     */
    private final String errorCode;
    /**
     * The error message.
     * 
     */
    private final String errorMessage;
    /**
     * The error message parameters.
     * 
     */
    private final Map<String,String> errorMessageParameters;
    /**
     * The error tags.
     * 
     */
    private final Map<String,String> errorTags;
    /**
     * The possible causes.
     * 
     */
    private final String possibleCauses;
    /**
     * The recommended action.
     * 
     */
    private final String recommendedAction;

    @CustomType.Constructor
    private InMageRcmAgentUpgradeBlockingErrorDetailsResponse(
        @CustomType.Parameter("errorCode") String errorCode,
        @CustomType.Parameter("errorMessage") String errorMessage,
        @CustomType.Parameter("errorMessageParameters") Map<String,String> errorMessageParameters,
        @CustomType.Parameter("errorTags") Map<String,String> errorTags,
        @CustomType.Parameter("possibleCauses") String possibleCauses,
        @CustomType.Parameter("recommendedAction") String recommendedAction) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorMessageParameters = errorMessageParameters;
        this.errorTags = errorTags;
        this.possibleCauses = possibleCauses;
        this.recommendedAction = recommendedAction;
    }

    /**
     * The error code.
     * 
    */
    public String errorCode() {
        return this.errorCode;
    }
    /**
     * The error message.
     * 
    */
    public String errorMessage() {
        return this.errorMessage;
    }
    /**
     * The error message parameters.
     * 
    */
    public Map<String,String> errorMessageParameters() {
        return this.errorMessageParameters;
    }
    /**
     * The error tags.
     * 
    */
    public Map<String,String> errorTags() {
        return this.errorTags;
    }
    /**
     * The possible causes.
     * 
    */
    public String possibleCauses() {
        return this.possibleCauses;
    }
    /**
     * The recommended action.
     * 
    */
    public String recommendedAction() {
        return this.recommendedAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageRcmAgentUpgradeBlockingErrorDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String errorCode;
        private String errorMessage;
        private Map<String,String> errorMessageParameters;
        private Map<String,String> errorTags;
        private String possibleCauses;
        private String recommendedAction;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageRcmAgentUpgradeBlockingErrorDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.errorMessage = defaults.errorMessage;
    	      this.errorMessageParameters = defaults.errorMessageParameters;
    	      this.errorTags = defaults.errorTags;
    	      this.possibleCauses = defaults.possibleCauses;
    	      this.recommendedAction = defaults.recommendedAction;
        }

        public Builder errorCode(String errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }
        public Builder errorMessageParameters(Map<String,String> errorMessageParameters) {
            this.errorMessageParameters = Objects.requireNonNull(errorMessageParameters);
            return this;
        }
        public Builder errorTags(Map<String,String> errorTags) {
            this.errorTags = Objects.requireNonNull(errorTags);
            return this;
        }
        public Builder possibleCauses(String possibleCauses) {
            this.possibleCauses = Objects.requireNonNull(possibleCauses);
            return this;
        }
        public Builder recommendedAction(String recommendedAction) {
            this.recommendedAction = Objects.requireNonNull(recommendedAction);
            return this;
        }        public InMageRcmAgentUpgradeBlockingErrorDetailsResponse build() {
            return new InMageRcmAgentUpgradeBlockingErrorDetailsResponse(errorCode, errorMessage, errorMessageParameters, errorTags, possibleCauses, recommendedAction);
        }
    }
}
