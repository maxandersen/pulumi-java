// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ConfigMapNodeConfigSourceArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding metadata) must be non-nil. This API is deprecated since 1.22
 * 
 */
public final class NodeConfigSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeConfigSourceArgs Empty = new NodeConfigSourceArgs();

    /**
     * ConfigMap is a reference to a Node's ConfigMap
     * 
     */
    @InputImport(name="configMap")
    private final @Nullable Input<ConfigMapNodeConfigSourceArgs> configMap;

    public Input<ConfigMapNodeConfigSourceArgs> getConfigMap() {
        return this.configMap == null ? Input.empty() : this.configMap;
    }

    public NodeConfigSourceArgs(@Nullable Input<ConfigMapNodeConfigSourceArgs> configMap) {
        this.configMap = configMap;
    }

    private NodeConfigSourceArgs() {
        this.configMap = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigMapNodeConfigSourceArgs> configMap;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMap = defaults.configMap;
        }

        public Builder setConfigMap(@Nullable Input<ConfigMapNodeConfigSourceArgs> configMap) {
            this.configMap = configMap;
            return this;
        }

        public Builder setConfigMap(@Nullable ConfigMapNodeConfigSourceArgs configMap) {
            this.configMap = Input.ofNullable(configMap);
            return this;
        }

        public NodeConfigSourceArgs build() {
            return new NodeConfigSourceArgs(configMap);
        }
    }
}
