// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListConnectionKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListConnectionKeysArgs Empty = new ListConnectionKeysArgs();

    /**
     * The connection name.
     * 
     */
    @Import(name="connectionName", required=true)
      private final String connectionName;

    public String connectionName() {
        return this.connectionName;
    }

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Kind of resource
     * 
     */
    @Import(name="kind")
      private final @Nullable String kind;

    public Optional<String> kind() {
        return this.kind == null ? Optional.empty() : Optional.ofNullable(this.kind);
    }

    /**
     * Resource Location
     * 
     */
    @Import(name="location")
      private final @Nullable String location;

    public Optional<String> location() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * Resource Name
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * Resource type
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * time span for how long the keys will be valid
     * 
     */
    @Import(name="validityTimeSpan")
      private final @Nullable String validityTimeSpan;

    public Optional<String> validityTimeSpan() {
        return this.validityTimeSpan == null ? Optional.empty() : Optional.ofNullable(this.validityTimeSpan);
    }

    public ListConnectionKeysArgs(
        String connectionName,
        @Nullable String id,
        @Nullable String kind,
        @Nullable String location,
        @Nullable String name,
        String resourceGroupName,
        @Nullable Map<String,String> tags,
        @Nullable String type,
        @Nullable String validityTimeSpan) {
        this.connectionName = Objects.requireNonNull(connectionName, "expected parameter 'connectionName' to be non-null");
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.type = type;
        this.validityTimeSpan = validityTimeSpan;
    }

    private ListConnectionKeysArgs() {
        this.connectionName = null;
        this.id = null;
        this.kind = null;
        this.location = null;
        this.name = null;
        this.resourceGroupName = null;
        this.tags = Map.of();
        this.type = null;
        this.validityTimeSpan = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListConnectionKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionName;
        private @Nullable String id;
        private @Nullable String kind;
        private @Nullable String location;
        private @Nullable String name;
        private String resourceGroupName;
        private @Nullable Map<String,String> tags;
        private @Nullable String type;
        private @Nullable String validityTimeSpan;

        public Builder() {
    	      // Empty
        }

        public Builder(ListConnectionKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionName = defaults.connectionName;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.validityTimeSpan = defaults.validityTimeSpan;
        }

        public Builder connectionName(String connectionName) {
            this.connectionName = Objects.requireNonNull(connectionName);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder validityTimeSpan(@Nullable String validityTimeSpan) {
            this.validityTimeSpan = validityTimeSpan;
            return this;
        }        public ListConnectionKeysArgs build() {
            return new ListConnectionKeysArgs(connectionName, id, kind, location, name, resourceGroupName, tags, type, validityTimeSpan);
        }
    }
}
