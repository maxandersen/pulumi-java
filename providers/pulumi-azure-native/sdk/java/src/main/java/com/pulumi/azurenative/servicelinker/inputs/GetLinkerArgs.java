// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicelinker.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetLinkerArgs extends InvokeArgs {

    public static final GetLinkerArgs Empty = new GetLinkerArgs();

    /**
     * The name Linker resource.
     * 
     */
    @Import(name="linkerName", required=true)
    private String linkerName;

    /**
     * @return The name Linker resource.
     * 
     */
    public String linkerName() {
        return this.linkerName;
    }

    /**
     * The fully qualified Azure Resource manager identifier of the resource to be connected.
     * 
     */
    @Import(name="resourceUri", required=true)
    private String resourceUri;

    /**
     * @return The fully qualified Azure Resource manager identifier of the resource to be connected.
     * 
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    private GetLinkerArgs() {}

    private GetLinkerArgs(GetLinkerArgs $) {
        this.linkerName = $.linkerName;
        this.resourceUri = $.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLinkerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLinkerArgs $;

        public Builder() {
            $ = new GetLinkerArgs();
        }

        public Builder(GetLinkerArgs defaults) {
            $ = new GetLinkerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linkerName The name Linker resource.
         * 
         * @return builder
         * 
         */
        public Builder linkerName(String linkerName) {
            $.linkerName = linkerName;
            return this;
        }

        /**
         * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(String resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        public GetLinkerArgs build() {
            $.linkerName = Objects.requireNonNull($.linkerName, "expected parameter 'linkerName' to be non-null");
            $.resourceUri = Objects.requireNonNull($.resourceUri, "expected parameter 'resourceUri' to be non-null");
            return $;
        }
    }

}
