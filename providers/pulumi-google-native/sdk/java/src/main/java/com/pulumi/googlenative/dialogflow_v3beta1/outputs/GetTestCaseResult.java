// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1ConversationTurnResponse;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1TestCaseResultResponse;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1TestConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTestCaseResult {
    /**
     * When the test was created.
     * 
     */
    private final String creationTime;
    /**
     * The human-readable name of the test case, unique within the agent. Limit of 200 characters.
     * 
     */
    private final String displayName;
    /**
     * The latest test result.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1TestCaseResultResponse lastTestResult;
    /**
     * The unique identifier of the test case. TestCases.CreateTestCase will populate the name automatically. Otherwise use format: `projects//locations//agents/ /testCases/`.
     * 
     */
    private final String name;
    /**
     * Additional freeform notes about the test case. Limit of 400 characters.
     * 
     */
    private final String notes;
    /**
     * Tags are short descriptions that users may apply to test cases for organizational and filtering purposes. Each tag should start with &#34;#&#34; and has a limit of 30 characters.
     * 
     */
    private final List<String> tags;
    /**
     * The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1ConversationTurnResponse> testCaseConversationTurns;
    /**
     * Config for the test case.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1TestConfigResponse testConfig;

    @CustomType.Constructor
    private GetTestCaseResult(
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("lastTestResult") GoogleCloudDialogflowCxV3beta1TestCaseResultResponse lastTestResult,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notes") String notes,
        @CustomType.Parameter("tags") List<String> tags,
        @CustomType.Parameter("testCaseConversationTurns") List<GoogleCloudDialogflowCxV3beta1ConversationTurnResponse> testCaseConversationTurns,
        @CustomType.Parameter("testConfig") GoogleCloudDialogflowCxV3beta1TestConfigResponse testConfig) {
        this.creationTime = creationTime;
        this.displayName = displayName;
        this.lastTestResult = lastTestResult;
        this.name = name;
        this.notes = notes;
        this.tags = tags;
        this.testCaseConversationTurns = testCaseConversationTurns;
        this.testConfig = testConfig;
    }

    /**
     * When the test was created.
     * 
    */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * The human-readable name of the test case, unique within the agent. Limit of 200 characters.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * The latest test result.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1TestCaseResultResponse lastTestResult() {
        return this.lastTestResult;
    }
    /**
     * The unique identifier of the test case. TestCases.CreateTestCase will populate the name automatically. Otherwise use format: `projects//locations//agents/ /testCases/`.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Additional freeform notes about the test case. Limit of 400 characters.
     * 
    */
    public String notes() {
        return this.notes;
    }
    /**
     * Tags are short descriptions that users may apply to test cases for organizational and filtering purposes. Each tag should start with &#34;#&#34; and has a limit of 30 characters.
     * 
    */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
     * 
    */
    public List<GoogleCloudDialogflowCxV3beta1ConversationTurnResponse> testCaseConversationTurns() {
        return this.testCaseConversationTurns;
    }
    /**
     * Config for the test case.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1TestConfigResponse testConfig() {
        return this.testConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestCaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private String displayName;
        private GoogleCloudDialogflowCxV3beta1TestCaseResultResponse lastTestResult;
        private String name;
        private String notes;
        private List<String> tags;
        private List<GoogleCloudDialogflowCxV3beta1ConversationTurnResponse> testCaseConversationTurns;
        private GoogleCloudDialogflowCxV3beta1TestConfigResponse testConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTestCaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.displayName = defaults.displayName;
    	      this.lastTestResult = defaults.lastTestResult;
    	      this.name = defaults.name;
    	      this.notes = defaults.notes;
    	      this.tags = defaults.tags;
    	      this.testCaseConversationTurns = defaults.testCaseConversationTurns;
    	      this.testConfig = defaults.testConfig;
        }

        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder lastTestResult(GoogleCloudDialogflowCxV3beta1TestCaseResultResponse lastTestResult) {
            this.lastTestResult = Objects.requireNonNull(lastTestResult);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notes(String notes) {
            this.notes = Objects.requireNonNull(notes);
            return this;
        }
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder testCaseConversationTurns(List<GoogleCloudDialogflowCxV3beta1ConversationTurnResponse> testCaseConversationTurns) {
            this.testCaseConversationTurns = Objects.requireNonNull(testCaseConversationTurns);
            return this;
        }
        public Builder testCaseConversationTurns(GoogleCloudDialogflowCxV3beta1ConversationTurnResponse... testCaseConversationTurns) {
            return testCaseConversationTurns(List.of(testCaseConversationTurns));
        }
        public Builder testConfig(GoogleCloudDialogflowCxV3beta1TestConfigResponse testConfig) {
            this.testConfig = Objects.requireNonNull(testConfig);
            return this;
        }        public GetTestCaseResult build() {
            return new GetTestCaseResult(creationTime, displayName, lastTestResult, name, notes, tags, testCaseConversationTurns, testConfig);
        }
    }
}
