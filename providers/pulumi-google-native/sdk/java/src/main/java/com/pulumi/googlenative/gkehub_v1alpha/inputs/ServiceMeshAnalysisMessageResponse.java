// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gkehub_v1alpha.inputs.ServiceMeshAnalysisMessageBaseResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * AnalysisMessage is a single message produced by an analyzer, and it used to communicate to the end user about the state of their Service Mesh configuration.
 * 
 */
public final class ServiceMeshAnalysisMessageResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceMeshAnalysisMessageResponse Empty = new ServiceMeshAnalysisMessageResponse();

    /**
     * A UI can combine these args with a template (based on message_base.type) to produce an internationalized message.
     * 
     */
    @Import(name="args", required=true)
      private final Map<String,String> args;

    public Map<String,String> args() {
        return this.args;
    }

    /**
     * A human readable description of what the error means. It is suitable for non-internationalize display purposes.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * Details common to all types of Istio and ServiceMesh analysis messages.
     * 
     */
    @Import(name="messageBase", required=true)
      private final ServiceMeshAnalysisMessageBaseResponse messageBase;

    public ServiceMeshAnalysisMessageBaseResponse messageBase() {
        return this.messageBase;
    }

    /**
     * A list of strings specifying the resource identifiers that were the cause of message generation. A "path" here may be: * MEMBERSHIP_ID if the cause is a specific member cluster * MEMBERSHIP_ID/(NAMESPACE\/)?RESOURCETYPE/NAME if the cause is a resource in a cluster
     * 
     */
    @Import(name="resourcePaths", required=true)
      private final List<String> resourcePaths;

    public List<String> resourcePaths() {
        return this.resourcePaths;
    }

    public ServiceMeshAnalysisMessageResponse(
        Map<String,String> args,
        String description,
        ServiceMeshAnalysisMessageBaseResponse messageBase,
        List<String> resourcePaths) {
        this.args = Objects.requireNonNull(args, "expected parameter 'args' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.messageBase = Objects.requireNonNull(messageBase, "expected parameter 'messageBase' to be non-null");
        this.resourcePaths = Objects.requireNonNull(resourcePaths, "expected parameter 'resourcePaths' to be non-null");
    }

    private ServiceMeshAnalysisMessageResponse() {
        this.args = Map.of();
        this.description = null;
        this.messageBase = null;
        this.resourcePaths = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMeshAnalysisMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> args;
        private String description;
        private ServiceMeshAnalysisMessageBaseResponse messageBase;
        private List<String> resourcePaths;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceMeshAnalysisMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.description = defaults.description;
    	      this.messageBase = defaults.messageBase;
    	      this.resourcePaths = defaults.resourcePaths;
        }

        public Builder args(Map<String,String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder messageBase(ServiceMeshAnalysisMessageBaseResponse messageBase) {
            this.messageBase = Objects.requireNonNull(messageBase);
            return this;
        }
        public Builder resourcePaths(List<String> resourcePaths) {
            this.resourcePaths = Objects.requireNonNull(resourcePaths);
            return this;
        }
        public Builder resourcePaths(String... resourcePaths) {
            return resourcePaths(List.of(resourcePaths));
        }        public ServiceMeshAnalysisMessageResponse build() {
            return new ServiceMeshAnalysisMessageResponse(args, description, messageBase, resourcePaths);
        }
    }
}
