// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.gkehub_v1alpha.outputs.ServiceMeshAnalysisMessageBaseResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class ServiceMeshAnalysisMessageResponse {
    /**
     * A UI can combine these args with a template (based on message_base.type) to produce an internationalized message.
     * 
     */
    private final Map<String,String> args;
    /**
     * A human readable description of what the error means. It is suitable for non-internationalize display purposes.
     * 
     */
    private final String description;
    /**
     * Details common to all types of Istio and ServiceMesh analysis messages.
     * 
     */
    private final ServiceMeshAnalysisMessageBaseResponse messageBase;
    /**
     * A list of strings specifying the resource identifiers that were the cause of message generation. A "path" here may be: * MEMBERSHIP_ID if the cause is a specific member cluster * MEMBERSHIP_ID/(NAMESPACE\/)?RESOURCETYPE/NAME if the cause is a resource in a cluster
     * 
     */
    private final List<String> resourcePaths;

    @OutputCustomType.Constructor
    private ServiceMeshAnalysisMessageResponse(
        @OutputCustomType.Parameter("args") Map<String,String> args,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("messageBase") ServiceMeshAnalysisMessageBaseResponse messageBase,
        @OutputCustomType.Parameter("resourcePaths") List<String> resourcePaths) {
        this.args = args;
        this.description = description;
        this.messageBase = messageBase;
        this.resourcePaths = resourcePaths;
    }

    /**
     * A UI can combine these args with a template (based on message_base.type) to produce an internationalized message.
     * 
    */
    public Map<String,String> getArgs() {
        return this.args;
    }
    /**
     * A human readable description of what the error means. It is suitable for non-internationalize display purposes.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Details common to all types of Istio and ServiceMesh analysis messages.
     * 
    */
    public ServiceMeshAnalysisMessageBaseResponse getMessageBase() {
        return this.messageBase;
    }
    /**
     * A list of strings specifying the resource identifiers that were the cause of message generation. A "path" here may be: * MEMBERSHIP_ID if the cause is a specific member cluster * MEMBERSHIP_ID/(NAMESPACE\/)?RESOURCETYPE/NAME if the cause is a resource in a cluster
     * 
    */
    public List<String> getResourcePaths() {
        return this.resourcePaths;
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

        public Builder setArgs(Map<String,String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setMessageBase(ServiceMeshAnalysisMessageBaseResponse messageBase) {
            this.messageBase = Objects.requireNonNull(messageBase);
            return this;
        }

        public Builder setResourcePaths(List<String> resourcePaths) {
            this.resourcePaths = Objects.requireNonNull(resourcePaths);
            return this;
        }
        public ServiceMeshAnalysisMessageResponse build() {
            return new ServiceMeshAnalysisMessageResponse(args, description, messageBase, resourcePaths);
        }
    }
}
