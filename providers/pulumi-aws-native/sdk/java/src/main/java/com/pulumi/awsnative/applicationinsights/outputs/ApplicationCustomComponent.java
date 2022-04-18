// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ApplicationCustomComponent {
    /**
     * The name of the component.
     * 
     */
    private final String componentName;
    /**
     * The list of resource ARNs that belong to the component.
     * 
     */
    private final List<String> resourceList;

    @CustomType.Constructor
    private ApplicationCustomComponent(
        @CustomType.Parameter("componentName") String componentName,
        @CustomType.Parameter("resourceList") List<String> resourceList) {
        this.componentName = componentName;
        this.resourceList = resourceList;
    }

    /**
     * The name of the component.
     * 
    */
    public String componentName() {
        return this.componentName;
    }
    /**
     * The list of resource ARNs that belong to the component.
     * 
    */
    public List<String> resourceList() {
        return this.resourceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationCustomComponent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String componentName;
        private List<String> resourceList;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationCustomComponent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentName = defaults.componentName;
    	      this.resourceList = defaults.resourceList;
        }

        public Builder componentName(String componentName) {
            this.componentName = Objects.requireNonNull(componentName);
            return this;
        }
        public Builder resourceList(List<String> resourceList) {
            this.resourceList = Objects.requireNonNull(resourceList);
            return this;
        }
        public Builder resourceList(String... resourceList) {
            return resourceList(List.of(resourceList));
        }        public ApplicationCustomComponent build() {
            return new ApplicationCustomComponent(componentName, resourceList);
        }
    }
}
