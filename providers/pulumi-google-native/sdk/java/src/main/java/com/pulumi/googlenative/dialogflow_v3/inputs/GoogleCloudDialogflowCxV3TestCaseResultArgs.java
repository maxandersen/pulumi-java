// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3.enums.GoogleCloudDialogflowCxV3TestCaseResultTestResult;
import com.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ConversationTurnArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a result from running a test case in an agent environment.
 * 
 */
public final class GoogleCloudDialogflowCxV3TestCaseResultArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3TestCaseResultArgs Empty = new GoogleCloudDialogflowCxV3TestCaseResultArgs();

    /**
     * The conversation turns uttered during the test case replay in chronological order.
     * 
     */
    @Import(name="conversationTurns")
    private @Nullable Output<List<GoogleCloudDialogflowCxV3ConversationTurnArgs>> conversationTurns;

    public Optional<Output<List<GoogleCloudDialogflowCxV3ConversationTurnArgs>>> conversationTurns() {
        return Optional.ofNullable(this.conversationTurns);
    }

    /**
     * Environment where the test was run. If not set, it indicates the draft environment.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<String> environment;

    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * The resource name for the test case result. Format: `projects//locations//agents//testCases/ /results/`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether the test case passed in the agent environment.
     * 
     */
    @Import(name="testResult")
    private @Nullable Output<GoogleCloudDialogflowCxV3TestCaseResultTestResult> testResult;

    public Optional<Output<GoogleCloudDialogflowCxV3TestCaseResultTestResult>> testResult() {
        return Optional.ofNullable(this.testResult);
    }

    /**
     * The time that the test was run.
     * 
     */
    @Import(name="testTime")
    private @Nullable Output<String> testTime;

    public Optional<Output<String>> testTime() {
        return Optional.ofNullable(this.testTime);
    }

    private GoogleCloudDialogflowCxV3TestCaseResultArgs() {}

    private GoogleCloudDialogflowCxV3TestCaseResultArgs(GoogleCloudDialogflowCxV3TestCaseResultArgs $) {
        this.conversationTurns = $.conversationTurns;
        this.environment = $.environment;
        this.name = $.name;
        this.testResult = $.testResult;
        this.testTime = $.testTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3TestCaseResultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3TestCaseResultArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3TestCaseResultArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3TestCaseResultArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3TestCaseResultArgs(Objects.requireNonNull(defaults));
        }

        public Builder conversationTurns(@Nullable Output<List<GoogleCloudDialogflowCxV3ConversationTurnArgs>> conversationTurns) {
            $.conversationTurns = conversationTurns;
            return this;
        }

        public Builder conversationTurns(List<GoogleCloudDialogflowCxV3ConversationTurnArgs> conversationTurns) {
            return conversationTurns(Output.of(conversationTurns));
        }

        public Builder conversationTurns(GoogleCloudDialogflowCxV3ConversationTurnArgs... conversationTurns) {
            return conversationTurns(List.of(conversationTurns));
        }

        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder testResult(@Nullable Output<GoogleCloudDialogflowCxV3TestCaseResultTestResult> testResult) {
            $.testResult = testResult;
            return this;
        }

        public Builder testResult(GoogleCloudDialogflowCxV3TestCaseResultTestResult testResult) {
            return testResult(Output.of(testResult));
        }

        public Builder testTime(@Nullable Output<String> testTime) {
            $.testTime = testTime;
            return this;
        }

        public Builder testTime(String testTime) {
            return testTime(Output.of(testTime));
        }

        public GoogleCloudDialogflowCxV3TestCaseResultArgs build() {
            return $;
        }
    }

}
