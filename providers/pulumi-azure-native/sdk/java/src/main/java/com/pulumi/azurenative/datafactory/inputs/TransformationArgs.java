// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.DataFlowReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.DatasetReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A data flow transformation.
 * 
 */
public final class TransformationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransformationArgs Empty = new TransformationArgs();

    /**
     * Dataset reference.
     * 
     */
    @Import(name="dataset")
    private @Nullable Output<DatasetReferenceArgs> dataset;

    public Optional<Output<DatasetReferenceArgs>> dataset() {
        return Optional.ofNullable(this.dataset);
    }

    /**
     * Transformation description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Flowlet Reference
     * 
     */
    @Import(name="flowlet")
    private @Nullable Output<DataFlowReferenceArgs> flowlet;

    public Optional<Output<DataFlowReferenceArgs>> flowlet() {
        return Optional.ofNullable(this.flowlet);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedService")
    private @Nullable Output<LinkedServiceReferenceArgs> linkedService;

    public Optional<Output<LinkedServiceReferenceArgs>> linkedService() {
        return Optional.ofNullable(this.linkedService);
    }

    /**
     * Transformation name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private TransformationArgs() {}

    private TransformationArgs(TransformationArgs $) {
        this.dataset = $.dataset;
        this.description = $.description;
        this.flowlet = $.flowlet;
        this.linkedService = $.linkedService;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransformationArgs $;

        public Builder() {
            $ = new TransformationArgs();
        }

        public Builder(TransformationArgs defaults) {
            $ = new TransformationArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataset(@Nullable Output<DatasetReferenceArgs> dataset) {
            $.dataset = dataset;
            return this;
        }

        public Builder dataset(DatasetReferenceArgs dataset) {
            return dataset(Output.of(dataset));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder flowlet(@Nullable Output<DataFlowReferenceArgs> flowlet) {
            $.flowlet = flowlet;
            return this;
        }

        public Builder flowlet(DataFlowReferenceArgs flowlet) {
            return flowlet(Output.of(flowlet));
        }

        public Builder linkedService(@Nullable Output<LinkedServiceReferenceArgs> linkedService) {
            $.linkedService = linkedService;
            return this;
        }

        public Builder linkedService(LinkedServiceReferenceArgs linkedService) {
            return linkedService(Output.of(linkedService));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public TransformationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
