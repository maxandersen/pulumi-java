// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sample input data for the service&#39;s input(s).
 * 
 */
public final class ExampleRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExampleRequestArgs Empty = new ExampleRequestArgs();

    /**
     * Sample input data for the web service&#39;s global parameters
     * 
     */
    @Import(name="globalParameters")
    private @Nullable Output<Map<String,Object>> globalParameters;

    public Optional<Output<Map<String,Object>>> globalParameters() {
        return Optional.ofNullable(this.globalParameters);
    }

    /**
     * Sample input data for the web service&#39;s input(s) given as an input name to sample input values matrix map.
     * 
     */
    @Import(name="inputs")
    private @Nullable Output<Map<String,List<List<Object>>>> inputs;

    public Optional<Output<Map<String,List<List<Object>>>>> inputs() {
        return Optional.ofNullable(this.inputs);
    }

    private ExampleRequestArgs() {}

    private ExampleRequestArgs(ExampleRequestArgs $) {
        this.globalParameters = $.globalParameters;
        this.inputs = $.inputs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExampleRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExampleRequestArgs $;

        public Builder() {
            $ = new ExampleRequestArgs();
        }

        public Builder(ExampleRequestArgs defaults) {
            $ = new ExampleRequestArgs(Objects.requireNonNull(defaults));
        }

        public Builder globalParameters(@Nullable Output<Map<String,Object>> globalParameters) {
            $.globalParameters = globalParameters;
            return this;
        }

        public Builder globalParameters(Map<String,Object> globalParameters) {
            return globalParameters(Output.of(globalParameters));
        }

        public Builder inputs(@Nullable Output<Map<String,List<List<Object>>>> inputs) {
            $.inputs = inputs;
            return this;
        }

        public Builder inputs(Map<String,List<List<Object>>> inputs) {
            return inputs(Output.of(inputs));
        }

        public ExampleRequestArgs build() {
            return $;
        }
    }

}
