// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MethodMapResponse {
    /**
     * @return The action identifier for the create method to be used for this collection
     * 
     */
    private final String create;
    /**
     * @return The action identifier for the delete method to be used for this collection
     * 
     */
    private final String delete;
    /**
     * @return The action identifier for the get method to be used for this collection
     * 
     */
    private final String get;
    /**
     * @return The action identifier for the setIamPolicy method to be used for this collection
     * 
     */
    private final String setIamPolicy;
    /**
     * @return The action identifier for the update method to be used for this collection
     * 
     */
    private final String update;

    @CustomType.Constructor
    private MethodMapResponse(
        @CustomType.Parameter("create") String create,
        @CustomType.Parameter("delete") String delete,
        @CustomType.Parameter("get") String get,
        @CustomType.Parameter("setIamPolicy") String setIamPolicy,
        @CustomType.Parameter("update") String update) {
        this.create = create;
        this.delete = delete;
        this.get = get;
        this.setIamPolicy = setIamPolicy;
        this.update = update;
    }

    /**
     * @return The action identifier for the create method to be used for this collection
     * 
     */
    public String create() {
        return this.create;
    }
    /**
     * @return The action identifier for the delete method to be used for this collection
     * 
     */
    public String delete() {
        return this.delete;
    }
    /**
     * @return The action identifier for the get method to be used for this collection
     * 
     */
    public String get() {
        return this.get;
    }
    /**
     * @return The action identifier for the setIamPolicy method to be used for this collection
     * 
     */
    public String setIamPolicy() {
        return this.setIamPolicy;
    }
    /**
     * @return The action identifier for the update method to be used for this collection
     * 
     */
    public String update() {
        return this.update;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodMapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String create;
        private String delete;
        private String get;
        private String setIamPolicy;
        private String update;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodMapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.create = defaults.create;
    	      this.delete = defaults.delete;
    	      this.get = defaults.get;
    	      this.setIamPolicy = defaults.setIamPolicy;
    	      this.update = defaults.update;
        }

        public Builder create(String create) {
            this.create = Objects.requireNonNull(create);
            return this;
        }
        public Builder delete(String delete) {
            this.delete = Objects.requireNonNull(delete);
            return this;
        }
        public Builder get(String get) {
            this.get = Objects.requireNonNull(get);
            return this;
        }
        public Builder setIamPolicy(String setIamPolicy) {
            this.setIamPolicy = Objects.requireNonNull(setIamPolicy);
            return this;
        }
        public Builder update(String update) {
            this.update = Objects.requireNonNull(update);
            return this;
        }        public MethodMapResponse build() {
            return new MethodMapResponse(create, delete, get, setIamPolicy, update);
        }
    }
}
