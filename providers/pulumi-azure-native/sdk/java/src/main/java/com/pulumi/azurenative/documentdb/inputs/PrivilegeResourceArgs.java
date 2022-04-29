// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Azure Cosmos DB Mongo DB Resource.
 * 
 */
public final class PrivilegeResourceArgs extends ResourceArgs {

    public static final PrivilegeResourceArgs Empty = new PrivilegeResourceArgs();

    /**
     * The collection name the role is applied.
     * 
     */
    @Import(name="collection")
    private @Nullable Output<String> collection;

    /**
     * @return The collection name the role is applied.
     * 
     */
    public Optional<Output<String>> collection() {
        return Optional.ofNullable(this.collection);
    }

    /**
     * The database name the role is applied.
     * 
     */
    @Import(name="db")
    private @Nullable Output<String> db;

    /**
     * @return The database name the role is applied.
     * 
     */
    public Optional<Output<String>> db() {
        return Optional.ofNullable(this.db);
    }

    private PrivilegeResourceArgs() {}

    private PrivilegeResourceArgs(PrivilegeResourceArgs $) {
        this.collection = $.collection;
        this.db = $.db;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivilegeResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivilegeResourceArgs $;

        public Builder() {
            $ = new PrivilegeResourceArgs();
        }

        public Builder(PrivilegeResourceArgs defaults) {
            $ = new PrivilegeResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param collection The collection name the role is applied.
         * 
         * @return builder
         * 
         */
        public Builder collection(@Nullable Output<String> collection) {
            $.collection = collection;
            return this;
        }

        /**
         * @param collection The collection name the role is applied.
         * 
         * @return builder
         * 
         */
        public Builder collection(String collection) {
            return collection(Output.of(collection));
        }

        /**
         * @param db The database name the role is applied.
         * 
         * @return builder
         * 
         */
        public Builder db(@Nullable Output<String> db) {
            $.db = db;
            return this;
        }

        /**
         * @param db The database name the role is applied.
         * 
         * @return builder
         * 
         */
        public Builder db(String db) {
            return db(Output.of(db));
        }

        public PrivilegeResourceArgs build() {
            return $;
        }
    }

}
