// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PartitionIndexPartitionIndexGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PartitionIndexPartitionIndexGetArgs Empty = new PartitionIndexPartitionIndexGetArgs();

    /**
     * Name of the partition index.
     * 
     */
    @Import(name="indexName")
    private @Nullable Output<String> indexName;

    public Optional<Output<String>> indexName() {
        return Optional.ofNullable(this.indexName);
    }

    @Import(name="indexStatus")
    private @Nullable Output<String> indexStatus;

    public Optional<Output<String>> indexStatus() {
        return Optional.ofNullable(this.indexStatus);
    }

    /**
     * Keys for the partition index.
     * 
     */
    @Import(name="keys")
    private @Nullable Output<List<String>> keys;

    public Optional<Output<List<String>>> keys() {
        return Optional.ofNullable(this.keys);
    }

    private PartitionIndexPartitionIndexGetArgs() {}

    private PartitionIndexPartitionIndexGetArgs(PartitionIndexPartitionIndexGetArgs $) {
        this.indexName = $.indexName;
        this.indexStatus = $.indexStatus;
        this.keys = $.keys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PartitionIndexPartitionIndexGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PartitionIndexPartitionIndexGetArgs $;

        public Builder() {
            $ = new PartitionIndexPartitionIndexGetArgs();
        }

        public Builder(PartitionIndexPartitionIndexGetArgs defaults) {
            $ = new PartitionIndexPartitionIndexGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder indexName(@Nullable Output<String> indexName) {
            $.indexName = indexName;
            return this;
        }

        public Builder indexName(String indexName) {
            return indexName(Output.of(indexName));
        }

        public Builder indexStatus(@Nullable Output<String> indexStatus) {
            $.indexStatus = indexStatus;
            return this;
        }

        public Builder indexStatus(String indexStatus) {
            return indexStatus(Output.of(indexStatus));
        }

        public Builder keys(@Nullable Output<List<String>> keys) {
            $.keys = keys;
            return this;
        }

        public Builder keys(List<String> keys) {
            return keys(Output.of(keys));
        }

        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }

        public PartitionIndexPartitionIndexGetArgs build() {
            return $;
        }
    }

}
