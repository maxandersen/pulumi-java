// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineMathArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineMathArgs Empty = new PipelineMathArgs();

    @Import(name="attribute", required=true)
    private Output<String> attribute;

    public Output<String> attribute() {
        return this.attribute;
    }

    @Import(name="math", required=true)
    private Output<String> math;

    public Output<String> math() {
        return this.math;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="next")
    private @Nullable Output<String> next;

    public Optional<Output<String>> next() {
        return Optional.ofNullable(this.next);
    }

    private PipelineMathArgs() {}

    private PipelineMathArgs(PipelineMathArgs $) {
        this.attribute = $.attribute;
        this.math = $.math;
        this.name = $.name;
        this.next = $.next;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineMathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineMathArgs $;

        public Builder() {
            $ = new PipelineMathArgs();
        }

        public Builder(PipelineMathArgs defaults) {
            $ = new PipelineMathArgs(Objects.requireNonNull(defaults));
        }

        public Builder attribute(Output<String> attribute) {
            $.attribute = attribute;
            return this;
        }

        public Builder attribute(String attribute) {
            return attribute(Output.of(attribute));
        }

        public Builder math(Output<String> math) {
            $.math = math;
            return this;
        }

        public Builder math(String math) {
            return math(Output.of(math));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder next(@Nullable Output<String> next) {
            $.next = next;
            return this;
        }

        public Builder next(String next) {
            return next(Output.of(next));
        }

        public PipelineMathArgs build() {
            $.attribute = Objects.requireNonNull($.attribute, "expected parameter 'attribute' to be non-null");
            $.math = Objects.requireNonNull($.math, "expected parameter 'math' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
