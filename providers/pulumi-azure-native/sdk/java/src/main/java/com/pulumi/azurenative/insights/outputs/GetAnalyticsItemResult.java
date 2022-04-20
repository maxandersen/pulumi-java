// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.ApplicationInsightsComponentAnalyticsItemPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAnalyticsItemResult {
    /**
     * The content of this item
     * 
     */
    private final @Nullable String content;
    /**
     * Internally assigned unique id of the item definition.
     * 
     */
    private final @Nullable String id;
    /**
     * The user-defined name of the item.
     * 
     */
    private final @Nullable String name;
    /**
     * A set of properties that can be defined in the context of a specific item type. Each type may have its own properties.
     * 
     */
    private final ApplicationInsightsComponentAnalyticsItemPropertiesResponse properties;
    /**
     * Enum indicating if this item definition is owned by a specific user or is shared between all users with access to the Application Insights component.
     * 
     */
    private final @Nullable String scope;
    /**
     * Date and time in UTC when this item was created.
     * 
     */
    private final String timeCreated;
    /**
     * Date and time in UTC of the last modification that was made to this item.
     * 
     */
    private final String timeModified;
    /**
     * Enum indicating the type of the Analytics item.
     * 
     */
    private final @Nullable String type;
    /**
     * This instance&#39;s version of the data model. This can change as new features are added.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetAnalyticsItemResult(
        @CustomType.Parameter("content") @Nullable String content,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("properties") ApplicationInsightsComponentAnalyticsItemPropertiesResponse properties,
        @CustomType.Parameter("scope") @Nullable String scope,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeModified") String timeModified,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("version") String version) {
        this.content = content;
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.scope = scope;
        this.timeCreated = timeCreated;
        this.timeModified = timeModified;
        this.type = type;
        this.version = version;
    }

    /**
     * The content of this item
     * 
    */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * Internally assigned unique id of the item definition.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The user-defined name of the item.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * A set of properties that can be defined in the context of a specific item type. Each type may have its own properties.
     * 
    */
    public ApplicationInsightsComponentAnalyticsItemPropertiesResponse properties() {
        return this.properties;
    }
    /**
     * Enum indicating if this item definition is owned by a specific user or is shared between all users with access to the Application Insights component.
     * 
    */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * Date and time in UTC when this item was created.
     * 
    */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * Date and time in UTC of the last modification that was made to this item.
     * 
    */
    public String timeModified() {
        return this.timeModified;
    }
    /**
     * Enum indicating the type of the Analytics item.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * This instance&#39;s version of the data model. This can change as new features are added.
     * 
    */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnalyticsItemResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private @Nullable String id;
        private @Nullable String name;
        private ApplicationInsightsComponentAnalyticsItemPropertiesResponse properties;
        private @Nullable String scope;
        private String timeCreated;
        private String timeModified;
        private @Nullable String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnalyticsItemResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.scope = defaults.scope;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeModified = defaults.timeModified;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder content(@Nullable String content) {
            this.content = content;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder properties(ApplicationInsightsComponentAnalyticsItemPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeModified(String timeModified) {
            this.timeModified = Objects.requireNonNull(timeModified);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetAnalyticsItemResult build() {
            return new GetAnalyticsItemResult(content, id, name, properties, scope, timeCreated, timeModified, type, version);
        }
    }
}
