// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb;

import com.pulumi.azurenative.documentdb.inputs.CreateUpdateOptionsArgs;
import com.pulumi.azurenative.documentdb.inputs.GremlinGraphResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GremlinResourceGremlinGraphArgs extends com.pulumi.resources.ResourceArgs {

    public static final GremlinResourceGremlinGraphArgs Empty = new GremlinResourceGremlinGraphArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Cosmos DB database name.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * Cosmos DB graph name.
     * 
     */
    @Import(name="graphName")
    private @Nullable Output<String> graphName;

    public Optional<Output<String>> graphName() {
        return Optional.ofNullable(this.graphName);
    }

    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
     * 
     */
    @Import(name="options")
    private @Nullable Output<CreateUpdateOptionsArgs> options;

    public Optional<Output<CreateUpdateOptionsArgs>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * The standard JSON format of a Gremlin graph
     * 
     */
    @Import(name="resource", required=true)
    private Output<GremlinGraphResourceArgs> resource;

    public Output<GremlinGraphResourceArgs> resource() {
        return this.resource;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GremlinResourceGremlinGraphArgs() {}

    private GremlinResourceGremlinGraphArgs(GremlinResourceGremlinGraphArgs $) {
        this.accountName = $.accountName;
        this.databaseName = $.databaseName;
        this.graphName = $.graphName;
        this.location = $.location;
        this.options = $.options;
        this.resource = $.resource;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GremlinResourceGremlinGraphArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GremlinResourceGremlinGraphArgs $;

        public Builder() {
            $ = new GremlinResourceGremlinGraphArgs();
        }

        public Builder(GremlinResourceGremlinGraphArgs defaults) {
            $ = new GremlinResourceGremlinGraphArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        public Builder graphName(@Nullable Output<String> graphName) {
            $.graphName = graphName;
            return this;
        }

        public Builder graphName(String graphName) {
            return graphName(Output.of(graphName));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder options(@Nullable Output<CreateUpdateOptionsArgs> options) {
            $.options = options;
            return this;
        }

        public Builder options(CreateUpdateOptionsArgs options) {
            return options(Output.of(options));
        }

        public Builder resource(Output<GremlinGraphResourceArgs> resource) {
            $.resource = resource;
            return this;
        }

        public Builder resource(GremlinGraphResourceArgs resource) {
            return resource(Output.of(resource));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GremlinResourceGremlinGraphArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resource = Objects.requireNonNull($.resource, "expected parameter 'resource' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
