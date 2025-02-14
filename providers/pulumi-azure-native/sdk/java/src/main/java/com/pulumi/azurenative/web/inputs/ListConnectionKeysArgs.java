// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListConnectionKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListConnectionKeysArgs Empty = new ListConnectionKeysArgs();

    /**
     * The connection name.
     * 
     */
    @Import(name="connectionName", required=true)
    private String connectionName;

    /**
     * @return The connection name.
     * 
     */
    public String connectionName() {
        return this.connectionName;
    }

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Resource Id
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Kind of resource
     * 
     */
    @Import(name="kind")
    private @Nullable String kind;

    /**
     * @return Kind of resource
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Resource Location
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    /**
     * @return Resource Location
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Resource Name
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Resource Name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Resource type
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return Resource type
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * time span for how long the keys will be valid
     * 
     */
    @Import(name="validityTimeSpan")
    private @Nullable String validityTimeSpan;

    /**
     * @return time span for how long the keys will be valid
     * 
     */
    public Optional<String> validityTimeSpan() {
        return Optional.ofNullable(this.validityTimeSpan);
    }

    private ListConnectionKeysArgs() {}

    private ListConnectionKeysArgs(ListConnectionKeysArgs $) {
        this.connectionName = $.connectionName;
        this.id = $.id;
        this.kind = $.kind;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.type = $.type;
        this.validityTimeSpan = $.validityTimeSpan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListConnectionKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListConnectionKeysArgs $;

        public Builder() {
            $ = new ListConnectionKeysArgs();
        }

        public Builder(ListConnectionKeysArgs defaults) {
            $ = new ListConnectionKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionName The connection name.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(String connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        /**
         * @param id Resource Id
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param kind Kind of resource
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param location Resource Location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        /**
         * @param name Resource Name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param type Resource type
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        /**
         * @param validityTimeSpan time span for how long the keys will be valid
         * 
         * @return builder
         * 
         */
        public Builder validityTimeSpan(@Nullable String validityTimeSpan) {
            $.validityTimeSpan = validityTimeSpan;
            return this;
        }

        public ListConnectionKeysArgs build() {
            $.connectionName = Objects.requireNonNull($.connectionName, "expected parameter 'connectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
