// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebhookResult {
    /**
     * The list of actions that trigger the webhook to post notifications.
     * 
     */
    private final List<String> actions;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    private final String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The provisioning state of the webhook at the time the operation was called.
     * 
     */
    private final String provisioningState;
    /**
     * The scope of repositories where the event can be triggered. For example, 'foo:*' means events for all tags under repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to 'foo:latest'. Empty means all events.
     * 
     */
    private final @Nullable String scope;
    /**
     * The status of the webhook at the time the operation was called.
     * 
     */
    private final @Nullable String status;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWebhookResult(
        @CustomType.Parameter("actions") List<String> actions,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("scope") @Nullable String scope,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.actions = actions;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.scope = scope;
        this.status = status;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The list of actions that trigger the webhook to post notifications.
     * 
    */
    public List<String> actions() {
        return this.actions;
    }
    /**
     * The resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The provisioning state of the webhook at the time the operation was called.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The scope of repositories where the event can be triggered. For example, 'foo:*' means events for all tags under repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to 'foo:latest'. Empty means all events.
     * 
    */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * The status of the webhook at the time the operation was called.
     * 
    */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebhookResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> actions;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable String scope;
        private @Nullable String status;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebhookResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.scope = defaults.scope;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder actions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetWebhookResult build() {
            return new GetWebhookResult(actions, id, location, name, provisioningState, scope, status, tags, type);
        }
    }
}
