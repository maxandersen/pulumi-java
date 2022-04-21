// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.azurenative.sql.enums.JobStepActionSource;
import com.pulumi.azurenative.sql.enums.JobStepActionType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The action to be executed by a job step.
 * 
 */
public final class JobStepActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobStepActionArgs Empty = new JobStepActionArgs();

    /**
     * The source of the action to execute.
     * 
     */
    @Import(name="source")
    private @Nullable Output<Either<String,JobStepActionSource>> source;

    public Optional<Output<Either<String,JobStepActionSource>>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * Type of action being executed by the job step.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,JobStepActionType>> type;

    public Optional<Output<Either<String,JobStepActionType>>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The action value, for example the text of the T-SQL script to execute.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private JobStepActionArgs() {}

    private JobStepActionArgs(JobStepActionArgs $) {
        this.source = $.source;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobStepActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobStepActionArgs $;

        public Builder() {
            $ = new JobStepActionArgs();
        }

        public Builder(JobStepActionArgs defaults) {
            $ = new JobStepActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder source(@Nullable Output<Either<String,JobStepActionSource>> source) {
            $.source = source;
            return this;
        }

        public Builder source(Either<String,JobStepActionSource> source) {
            return source(Output.of(source));
        }

        public Builder type(@Nullable Output<Either<String,JobStepActionType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,JobStepActionType> type) {
            return type(Output.of(type));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public JobStepActionArgs build() {
            $.source = Codegen.stringProp("source").left(JobStepActionSource.class).output().arg($.source).def("Inline").getNullable();
            $.type = Codegen.stringProp("type").left(JobStepActionType.class).output().arg($.type).def("TSql").getNullable();
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
