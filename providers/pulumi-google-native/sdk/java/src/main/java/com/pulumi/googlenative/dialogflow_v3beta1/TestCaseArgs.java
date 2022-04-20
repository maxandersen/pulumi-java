// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ConversationTurnArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1TestCaseResultArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1TestConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TestCaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final TestCaseArgs Empty = new TestCaseArgs();

    @Import(name="agentId", required=true)
      private final Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }

    /**
     * The human-readable name of the test case, unique within the agent. Limit of 200 characters.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The latest test result.
     * 
     */
    @Import(name="lastTestResult")
      private final @Nullable Output<GoogleCloudDialogflowCxV3beta1TestCaseResultArgs> lastTestResult;

    public Output<GoogleCloudDialogflowCxV3beta1TestCaseResultArgs> lastTestResult() {
        return this.lastTestResult == null ? Codegen.empty() : this.lastTestResult;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The unique identifier of the test case. TestCases.CreateTestCase will populate the name automatically. Otherwise use format: `projects//locations//agents/ /testCases/`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Additional freeform notes about the test case. Limit of 400 characters.
     * 
     */
    @Import(name="notes")
      private final @Nullable Output<String> notes;

    public Output<String> notes() {
        return this.notes == null ? Codegen.empty() : this.notes;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Tags are short descriptions that users may apply to test cases for organizational and filtering purposes. Each tag should start with &#34;#&#34; and has a limit of 30 characters.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
     * 
     */
    @Import(name="testCaseConversationTurns")
      private final @Nullable Output<List<GoogleCloudDialogflowCxV3beta1ConversationTurnArgs>> testCaseConversationTurns;

    public Output<List<GoogleCloudDialogflowCxV3beta1ConversationTurnArgs>> testCaseConversationTurns() {
        return this.testCaseConversationTurns == null ? Codegen.empty() : this.testCaseConversationTurns;
    }

    /**
     * Config for the test case.
     * 
     */
    @Import(name="testConfig")
      private final @Nullable Output<GoogleCloudDialogflowCxV3beta1TestConfigArgs> testConfig;

    public Output<GoogleCloudDialogflowCxV3beta1TestConfigArgs> testConfig() {
        return this.testConfig == null ? Codegen.empty() : this.testConfig;
    }

    public TestCaseArgs(
        Output<String> agentId,
        Output<String> displayName,
        @Nullable Output<GoogleCloudDialogflowCxV3beta1TestCaseResultArgs> lastTestResult,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> notes,
        @Nullable Output<String> project,
        @Nullable Output<List<String>> tags,
        @Nullable Output<List<GoogleCloudDialogflowCxV3beta1ConversationTurnArgs>> testCaseConversationTurns,
        @Nullable Output<GoogleCloudDialogflowCxV3beta1TestConfigArgs> testConfig) {
        this.agentId = Objects.requireNonNull(agentId, "expected parameter 'agentId' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.lastTestResult = lastTestResult;
        this.location = location;
        this.name = name;
        this.notes = notes;
        this.project = project;
        this.tags = tags;
        this.testCaseConversationTurns = testCaseConversationTurns;
        this.testConfig = testConfig;
    }

    private TestCaseArgs() {
        this.agentId = Codegen.empty();
        this.displayName = Codegen.empty();
        this.lastTestResult = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.notes = Codegen.empty();
        this.project = Codegen.empty();
        this.tags = Codegen.empty();
        this.testCaseConversationTurns = Codegen.empty();
        this.testConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestCaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> agentId;
        private Output<String> displayName;
        private @Nullable Output<GoogleCloudDialogflowCxV3beta1TestCaseResultArgs> lastTestResult;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> notes;
        private @Nullable Output<String> project;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<List<GoogleCloudDialogflowCxV3beta1ConversationTurnArgs>> testCaseConversationTurns;
        private @Nullable Output<GoogleCloudDialogflowCxV3beta1TestConfigArgs> testConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(TestCaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.displayName = defaults.displayName;
    	      this.lastTestResult = defaults.lastTestResult;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notes = defaults.notes;
    	      this.project = defaults.project;
    	      this.tags = defaults.tags;
    	      this.testCaseConversationTurns = defaults.testCaseConversationTurns;
    	      this.testConfig = defaults.testConfig;
        }

        public Builder agentId(Output<String> agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }
        public Builder agentId(String agentId) {
            this.agentId = Output.of(Objects.requireNonNull(agentId));
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder lastTestResult(@Nullable Output<GoogleCloudDialogflowCxV3beta1TestCaseResultArgs> lastTestResult) {
            this.lastTestResult = lastTestResult;
            return this;
        }
        public Builder lastTestResult(@Nullable GoogleCloudDialogflowCxV3beta1TestCaseResultArgs lastTestResult) {
            this.lastTestResult = Codegen.ofNullable(lastTestResult);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder notes(@Nullable Output<String> notes) {
            this.notes = notes;
            return this;
        }
        public Builder notes(@Nullable String notes) {
            this.notes = Codegen.ofNullable(notes);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder testCaseConversationTurns(@Nullable Output<List<GoogleCloudDialogflowCxV3beta1ConversationTurnArgs>> testCaseConversationTurns) {
            this.testCaseConversationTurns = testCaseConversationTurns;
            return this;
        }
        public Builder testCaseConversationTurns(@Nullable List<GoogleCloudDialogflowCxV3beta1ConversationTurnArgs> testCaseConversationTurns) {
            this.testCaseConversationTurns = Codegen.ofNullable(testCaseConversationTurns);
            return this;
        }
        public Builder testCaseConversationTurns(GoogleCloudDialogflowCxV3beta1ConversationTurnArgs... testCaseConversationTurns) {
            return testCaseConversationTurns(List.of(testCaseConversationTurns));
        }
        public Builder testConfig(@Nullable Output<GoogleCloudDialogflowCxV3beta1TestConfigArgs> testConfig) {
            this.testConfig = testConfig;
            return this;
        }
        public Builder testConfig(@Nullable GoogleCloudDialogflowCxV3beta1TestConfigArgs testConfig) {
            this.testConfig = Codegen.ofNullable(testConfig);
            return this;
        }        public TestCaseArgs build() {
            return new TestCaseArgs(agentId, displayName, lastTestResult, location, name, notes, project, tags, testCaseConversationTurns, testConfig);
        }
    }
}
