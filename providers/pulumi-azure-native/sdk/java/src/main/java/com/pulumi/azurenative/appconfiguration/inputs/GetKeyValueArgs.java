// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appconfiguration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetKeyValueArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyValueArgs Empty = new GetKeyValueArgs();

    /**
     * The name of the configuration store.
     * 
     */
    @Import(name="configStoreName", required=true)
    private String configStoreName;

    public String configStoreName() {
        return this.configStoreName;
    }

    /**
     * Identifier of key and label combination. Key and label are joined by $ character. Label is optional.
     * 
     */
    @Import(name="keyValueName", required=true)
    private String keyValueName;

    public String keyValueName() {
        return this.keyValueName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetKeyValueArgs() {}

    private GetKeyValueArgs(GetKeyValueArgs $) {
        this.configStoreName = $.configStoreName;
        this.keyValueName = $.keyValueName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyValueArgs $;

        public Builder() {
            $ = new GetKeyValueArgs();
        }

        public Builder(GetKeyValueArgs defaults) {
            $ = new GetKeyValueArgs(Objects.requireNonNull(defaults));
        }

        public Builder configStoreName(String configStoreName) {
            $.configStoreName = configStoreName;
            return this;
        }

        public Builder keyValueName(String keyValueName) {
            $.keyValueName = keyValueName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetKeyValueArgs build() {
            $.configStoreName = Objects.requireNonNull($.configStoreName, "expected parameter 'configStoreName' to be non-null");
            $.keyValueName = Objects.requireNonNull($.keyValueName, "expected parameter 'keyValueName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
