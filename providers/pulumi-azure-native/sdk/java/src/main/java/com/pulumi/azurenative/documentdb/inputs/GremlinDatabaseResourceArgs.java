// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Cosmos DB Gremlin database resource object
 * 
 */
public final class GremlinDatabaseResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GremlinDatabaseResourceArgs Empty = new GremlinDatabaseResourceArgs();

    /**
     * Name of the Cosmos DB Gremlin database
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    private GremlinDatabaseResourceArgs() {}

    private GremlinDatabaseResourceArgs(GremlinDatabaseResourceArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GremlinDatabaseResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GremlinDatabaseResourceArgs $;

        public Builder() {
            $ = new GremlinDatabaseResourceArgs();
        }

        public Builder(GremlinDatabaseResourceArgs defaults) {
            $ = new GremlinDatabaseResourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GremlinDatabaseResourceArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
