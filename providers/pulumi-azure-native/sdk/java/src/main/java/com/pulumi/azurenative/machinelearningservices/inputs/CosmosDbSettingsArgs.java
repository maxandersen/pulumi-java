// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CosmosDbSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CosmosDbSettingsArgs Empty = new CosmosDbSettingsArgs();

    /**
     * The throughput of the collections in cosmosdb database
     * 
     */
    @Import(name="collectionsThroughput")
    private @Nullable Output<Integer> collectionsThroughput;

    public Optional<Output<Integer>> collectionsThroughput() {
        return Optional.ofNullable(this.collectionsThroughput);
    }

    private CosmosDbSettingsArgs() {}

    private CosmosDbSettingsArgs(CosmosDbSettingsArgs $) {
        this.collectionsThroughput = $.collectionsThroughput;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CosmosDbSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CosmosDbSettingsArgs $;

        public Builder() {
            $ = new CosmosDbSettingsArgs();
        }

        public Builder(CosmosDbSettingsArgs defaults) {
            $ = new CosmosDbSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder collectionsThroughput(@Nullable Output<Integer> collectionsThroughput) {
            $.collectionsThroughput = collectionsThroughput;
            return this;
        }

        public Builder collectionsThroughput(Integer collectionsThroughput) {
            return collectionsThroughput(Output.of(collectionsThroughput));
        }

        public CosmosDbSettingsArgs build() {
            return $;
        }
    }

}
