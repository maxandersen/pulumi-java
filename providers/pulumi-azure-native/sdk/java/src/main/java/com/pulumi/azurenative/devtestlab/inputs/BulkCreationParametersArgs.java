// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters for creating multiple virtual machines as a single action.
 * 
 */
public final class BulkCreationParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final BulkCreationParametersArgs Empty = new BulkCreationParametersArgs();

    /**
     * The number of virtual machine instances to create.
     * 
     */
    @Import(name="instanceCount")
    private @Nullable Output<Integer> instanceCount;

    public Optional<Output<Integer>> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }

    private BulkCreationParametersArgs() {}

    private BulkCreationParametersArgs(BulkCreationParametersArgs $) {
        this.instanceCount = $.instanceCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BulkCreationParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BulkCreationParametersArgs $;

        public Builder() {
            $ = new BulkCreationParametersArgs();
        }

        public Builder(BulkCreationParametersArgs defaults) {
            $ = new BulkCreationParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceCount(@Nullable Output<Integer> instanceCount) {
            $.instanceCount = instanceCount;
            return this;
        }

        public Builder instanceCount(Integer instanceCount) {
            return instanceCount(Output.of(instanceCount));
        }

        public BulkCreationParametersArgs build() {
            return $;
        }
    }

}
