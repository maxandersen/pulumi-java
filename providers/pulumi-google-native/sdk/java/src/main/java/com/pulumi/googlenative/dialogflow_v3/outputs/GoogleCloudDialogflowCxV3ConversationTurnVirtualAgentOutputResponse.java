// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3IntentResponse;
import com.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3PageResponse;
import com.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ResponseMessageTextResponse;
import com.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3TestRunDifferenceResponse;
import com.pulumi.googlenative.dialogflow_v3.outputs.GoogleRpcStatusResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse {
    /**
     * The Page on which the utterance was spoken. Only name and displayName will be set.
     * 
     */
    private final GoogleCloudDialogflowCxV3PageResponse currentPage;
    /**
     * Input only. The diagnostic info output for the turn. Required to calculate the testing coverage.
     * 
     */
    private final Map<String,String> diagnosticInfo;
    /**
     * If this is part of a result conversation turn, the list of differences between the original run and the replay for this output, if any.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3TestRunDifferenceResponse> differences;
    /**
     * The session parameters available to the bot at this point.
     * 
     */
    private final Map<String,String> sessionParameters;
    /**
     * Response error from the agent in the test result. If set, other output is empty.
     * 
     */
    private final GoogleRpcStatusResponse status;
    /**
     * The text responses from the agent for the turn.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3ResponseMessageTextResponse> textResponses;
    /**
     * The Intent that triggered the response. Only name and displayName will be set.
     * 
     */
    private final GoogleCloudDialogflowCxV3IntentResponse triggeredIntent;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse(
        @CustomType.Parameter("currentPage") GoogleCloudDialogflowCxV3PageResponse currentPage,
        @CustomType.Parameter("diagnosticInfo") Map<String,String> diagnosticInfo,
        @CustomType.Parameter("differences") List<GoogleCloudDialogflowCxV3TestRunDifferenceResponse> differences,
        @CustomType.Parameter("sessionParameters") Map<String,String> sessionParameters,
        @CustomType.Parameter("status") GoogleRpcStatusResponse status,
        @CustomType.Parameter("textResponses") List<GoogleCloudDialogflowCxV3ResponseMessageTextResponse> textResponses,
        @CustomType.Parameter("triggeredIntent") GoogleCloudDialogflowCxV3IntentResponse triggeredIntent) {
        this.currentPage = currentPage;
        this.diagnosticInfo = diagnosticInfo;
        this.differences = differences;
        this.sessionParameters = sessionParameters;
        this.status = status;
        this.textResponses = textResponses;
        this.triggeredIntent = triggeredIntent;
    }

    /**
     * The Page on which the utterance was spoken. Only name and displayName will be set.
     * 
    */
    public GoogleCloudDialogflowCxV3PageResponse currentPage() {
        return this.currentPage;
    }
    /**
     * Input only. The diagnostic info output for the turn. Required to calculate the testing coverage.
     * 
    */
    public Map<String,String> diagnosticInfo() {
        return this.diagnosticInfo;
    }
    /**
     * If this is part of a result conversation turn, the list of differences between the original run and the replay for this output, if any.
     * 
    */
    public List<GoogleCloudDialogflowCxV3TestRunDifferenceResponse> differences() {
        return this.differences;
    }
    /**
     * The session parameters available to the bot at this point.
     * 
    */
    public Map<String,String> sessionParameters() {
        return this.sessionParameters;
    }
    /**
     * Response error from the agent in the test result. If set, other output is empty.
     * 
    */
    public GoogleRpcStatusResponse status() {
        return this.status;
    }
    /**
     * The text responses from the agent for the turn.
     * 
    */
    public List<GoogleCloudDialogflowCxV3ResponseMessageTextResponse> textResponses() {
        return this.textResponses;
    }
    /**
     * The Intent that triggered the response. Only name and displayName will be set.
     * 
    */
    public GoogleCloudDialogflowCxV3IntentResponse triggeredIntent() {
        return this.triggeredIntent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3PageResponse currentPage;
        private Map<String,String> diagnosticInfo;
        private List<GoogleCloudDialogflowCxV3TestRunDifferenceResponse> differences;
        private Map<String,String> sessionParameters;
        private GoogleRpcStatusResponse status;
        private List<GoogleCloudDialogflowCxV3ResponseMessageTextResponse> textResponses;
        private GoogleCloudDialogflowCxV3IntentResponse triggeredIntent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentPage = defaults.currentPage;
    	      this.diagnosticInfo = defaults.diagnosticInfo;
    	      this.differences = defaults.differences;
    	      this.sessionParameters = defaults.sessionParameters;
    	      this.status = defaults.status;
    	      this.textResponses = defaults.textResponses;
    	      this.triggeredIntent = defaults.triggeredIntent;
        }

        public Builder currentPage(GoogleCloudDialogflowCxV3PageResponse currentPage) {
            this.currentPage = Objects.requireNonNull(currentPage);
            return this;
        }
        public Builder diagnosticInfo(Map<String,String> diagnosticInfo) {
            this.diagnosticInfo = Objects.requireNonNull(diagnosticInfo);
            return this;
        }
        public Builder differences(List<GoogleCloudDialogflowCxV3TestRunDifferenceResponse> differences) {
            this.differences = Objects.requireNonNull(differences);
            return this;
        }
        public Builder differences(GoogleCloudDialogflowCxV3TestRunDifferenceResponse... differences) {
            return differences(List.of(differences));
        }
        public Builder sessionParameters(Map<String,String> sessionParameters) {
            this.sessionParameters = Objects.requireNonNull(sessionParameters);
            return this;
        }
        public Builder status(GoogleRpcStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder textResponses(List<GoogleCloudDialogflowCxV3ResponseMessageTextResponse> textResponses) {
            this.textResponses = Objects.requireNonNull(textResponses);
            return this;
        }
        public Builder textResponses(GoogleCloudDialogflowCxV3ResponseMessageTextResponse... textResponses) {
            return textResponses(List.of(textResponses));
        }
        public Builder triggeredIntent(GoogleCloudDialogflowCxV3IntentResponse triggeredIntent) {
            this.triggeredIntent = Objects.requireNonNull(triggeredIntent);
            return this;
        }        public GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse build() {
            return new GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse(currentPage, diagnosticInfo, differences, sessionParameters, status, textResponses, triggeredIntent);
        }
    }
}
