// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntryBigqueryDateShardedSpecGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EntryBigqueryDateShardedSpecGetArgs Empty = new EntryBigqueryDateShardedSpecGetArgs();

    @Import(name="dataset")
    private @Nullable Output<String> dataset;

    public Optional<Output<String>> dataset() {
        return Optional.ofNullable(this.dataset);
    }

    @Import(name="shardCount")
    private @Nullable Output<Integer> shardCount;

    public Optional<Output<Integer>> shardCount() {
        return Optional.ofNullable(this.shardCount);
    }

    @Import(name="tablePrefix")
    private @Nullable Output<String> tablePrefix;

    public Optional<Output<String>> tablePrefix() {
        return Optional.ofNullable(this.tablePrefix);
    }

    private EntryBigqueryDateShardedSpecGetArgs() {}

    private EntryBigqueryDateShardedSpecGetArgs(EntryBigqueryDateShardedSpecGetArgs $) {
        this.dataset = $.dataset;
        this.shardCount = $.shardCount;
        this.tablePrefix = $.tablePrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntryBigqueryDateShardedSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntryBigqueryDateShardedSpecGetArgs $;

        public Builder() {
            $ = new EntryBigqueryDateShardedSpecGetArgs();
        }

        public Builder(EntryBigqueryDateShardedSpecGetArgs defaults) {
            $ = new EntryBigqueryDateShardedSpecGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataset(@Nullable Output<String> dataset) {
            $.dataset = dataset;
            return this;
        }

        public Builder dataset(String dataset) {
            return dataset(Output.of(dataset));
        }

        public Builder shardCount(@Nullable Output<Integer> shardCount) {
            $.shardCount = shardCount;
            return this;
        }

        public Builder shardCount(Integer shardCount) {
            return shardCount(Output.of(shardCount));
        }

        public Builder tablePrefix(@Nullable Output<String> tablePrefix) {
            $.tablePrefix = tablePrefix;
            return this;
        }

        public Builder tablePrefix(String tablePrefix) {
            return tablePrefix(Output.of(tablePrefix));
        }

        public EntryBigqueryDateShardedSpecGetArgs build() {
            return $;
        }
    }

}
