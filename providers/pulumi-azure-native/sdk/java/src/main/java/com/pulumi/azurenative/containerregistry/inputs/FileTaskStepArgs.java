// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.SetValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a task step.
 * 
 */
public final class FileTaskStepArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileTaskStepArgs Empty = new FileTaskStepArgs();

    /**
     * The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    @Import(name="contextAccessToken")
    private @Nullable Output<String> contextAccessToken;

    /**
     * @return The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    public Optional<Output<String>> contextAccessToken() {
        return Optional.ofNullable(this.contextAccessToken);
    }

    /**
     * The URL(absolute or relative) of the source context for the task step.
     * 
     */
    @Import(name="contextPath")
    private @Nullable Output<String> contextPath;

    /**
     * @return The URL(absolute or relative) of the source context for the task step.
     * 
     */
    public Optional<Output<String>> contextPath() {
        return Optional.ofNullable(this.contextPath);
    }

    /**
     * The task template/definition file path relative to the source context.
     * 
     */
    @Import(name="taskFilePath", required=true)
    private Output<String> taskFilePath;

    /**
     * @return The task template/definition file path relative to the source context.
     * 
     */
    public Output<String> taskFilePath() {
        return this.taskFilePath;
    }

    /**
     * The type of the step.
     * Expected value is &#39;FileTask&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the step.
     * Expected value is &#39;FileTask&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The collection of overridable values that can be passed when running a task.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<SetValueArgs>> values;

    /**
     * @return The collection of overridable values that can be passed when running a task.
     * 
     */
    public Optional<Output<List<SetValueArgs>>> values() {
        return Optional.ofNullable(this.values);
    }

    /**
     * The task values/parameters file path relative to the source context.
     * 
     */
    @Import(name="valuesFilePath")
    private @Nullable Output<String> valuesFilePath;

    /**
     * @return The task values/parameters file path relative to the source context.
     * 
     */
    public Optional<Output<String>> valuesFilePath() {
        return Optional.ofNullable(this.valuesFilePath);
    }

    private FileTaskStepArgs() {}

    private FileTaskStepArgs(FileTaskStepArgs $) {
        this.contextAccessToken = $.contextAccessToken;
        this.contextPath = $.contextPath;
        this.taskFilePath = $.taskFilePath;
        this.type = $.type;
        this.values = $.values;
        this.valuesFilePath = $.valuesFilePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileTaskStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileTaskStepArgs $;

        public Builder() {
            $ = new FileTaskStepArgs();
        }

        public Builder(FileTaskStepArgs defaults) {
            $ = new FileTaskStepArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contextAccessToken The token (git PAT or SAS token of storage account blob) associated with the context for a step.
         * 
         * @return builder
         * 
         */
        public Builder contextAccessToken(@Nullable Output<String> contextAccessToken) {
            $.contextAccessToken = contextAccessToken;
            return this;
        }

        /**
         * @param contextAccessToken The token (git PAT or SAS token of storage account blob) associated with the context for a step.
         * 
         * @return builder
         * 
         */
        public Builder contextAccessToken(String contextAccessToken) {
            return contextAccessToken(Output.of(contextAccessToken));
        }

        /**
         * @param contextPath The URL(absolute or relative) of the source context for the task step.
         * 
         * @return builder
         * 
         */
        public Builder contextPath(@Nullable Output<String> contextPath) {
            $.contextPath = contextPath;
            return this;
        }

        /**
         * @param contextPath The URL(absolute or relative) of the source context for the task step.
         * 
         * @return builder
         * 
         */
        public Builder contextPath(String contextPath) {
            return contextPath(Output.of(contextPath));
        }

        /**
         * @param taskFilePath The task template/definition file path relative to the source context.
         * 
         * @return builder
         * 
         */
        public Builder taskFilePath(Output<String> taskFilePath) {
            $.taskFilePath = taskFilePath;
            return this;
        }

        /**
         * @param taskFilePath The task template/definition file path relative to the source context.
         * 
         * @return builder
         * 
         */
        public Builder taskFilePath(String taskFilePath) {
            return taskFilePath(Output.of(taskFilePath));
        }

        /**
         * @param type The type of the step.
         * Expected value is &#39;FileTask&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the step.
         * Expected value is &#39;FileTask&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param values The collection of overridable values that can be passed when running a task.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<SetValueArgs>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The collection of overridable values that can be passed when running a task.
         * 
         * @return builder
         * 
         */
        public Builder values(List<SetValueArgs> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The collection of overridable values that can be passed when running a task.
         * 
         * @return builder
         * 
         */
        public Builder values(SetValueArgs... values) {
            return values(List.of(values));
        }

        /**
         * @param valuesFilePath The task values/parameters file path relative to the source context.
         * 
         * @return builder
         * 
         */
        public Builder valuesFilePath(@Nullable Output<String> valuesFilePath) {
            $.valuesFilePath = valuesFilePath;
            return this;
        }

        /**
         * @param valuesFilePath The task values/parameters file path relative to the source context.
         * 
         * @return builder
         * 
         */
        public Builder valuesFilePath(String valuesFilePath) {
            return valuesFilePath(Output.of(valuesFilePath));
        }

        public FileTaskStepArgs build() {
            $.taskFilePath = Objects.requireNonNull($.taskFilePath, "expected parameter 'taskFilePath' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
