// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The unique key on that enforces uniqueness constraint on documents in the collection in the Azure Cosmos DB service.
 * 
 */
public final class UniqueKeyArgs extends ResourceArgs {

    public static final UniqueKeyArgs Empty = new UniqueKeyArgs();

    /**
     * List of paths must be unique for each document in the Azure Cosmos DB service
     * 
     */
    @Import(name="paths")
    private @Nullable Output<List<String>> paths;

    /**
     * @return List of paths must be unique for each document in the Azure Cosmos DB service
     * 
     */
    public Optional<Output<List<String>>> paths() {
        return Optional.ofNullable(this.paths);
    }

    private UniqueKeyArgs() {}

    private UniqueKeyArgs(UniqueKeyArgs $) {
        this.paths = $.paths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UniqueKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UniqueKeyArgs $;

        public Builder() {
            $ = new UniqueKeyArgs();
        }

        public Builder(UniqueKeyArgs defaults) {
            $ = new UniqueKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param paths List of paths must be unique for each document in the Azure Cosmos DB service
         * 
         * @return builder
         * 
         */
        public Builder paths(@Nullable Output<List<String>> paths) {
            $.paths = paths;
            return this;
        }

        /**
         * @param paths List of paths must be unique for each document in the Azure Cosmos DB service
         * 
         * @return builder
         * 
         */
        public Builder paths(List<String> paths) {
            return paths(Output.of(paths));
        }

        /**
         * @param paths List of paths must be unique for each document in the Azure Cosmos DB service
         * 
         * @return builder
         * 
         */
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }

        public UniqueKeyArgs build() {
            return $;
        }
    }

}
