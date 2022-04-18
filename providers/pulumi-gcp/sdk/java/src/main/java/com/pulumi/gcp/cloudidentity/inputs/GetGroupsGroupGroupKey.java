// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGroupsGroupGroupKey extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupsGroupGroupKey Empty = new GetGroupsGroupGroupKey();

    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    @Import(name="namespace", required=true)
      private final String namespace;

    public String namespace() {
        return this.namespace;
    }

    public GetGroupsGroupGroupKey(
        String id,
        String namespace) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private GetGroupsGroupGroupKey() {
        this.id = null;
        this.namespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupsGroupGroupKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupsGroupGroupKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }        public GetGroupsGroupGroupKey build() {
            return new GetGroupsGroupGroupKey(id, namespace);
        }
    }
}
