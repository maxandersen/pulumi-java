// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the On Premise resource that was assessed
 * 
 */
public final class OnPremiseResourceDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OnPremiseResourceDetailsArgs Empty = new OnPremiseResourceDetailsArgs();

    /**
     * The name of the machine
     * 
     */
    @Import(name="machineName", required=true)
    private Output<String> machineName;

    /**
     * @return The name of the machine
     * 
     */
    public Output<String> machineName() {
        return this.machineName;
    }

    /**
     * The platform where the assessed resource resides
     * Expected value is &#39;OnPremise&#39;.
     * 
     */
    @Import(name="source", required=true)
    private Output<String> source;

    /**
     * @return The platform where the assessed resource resides
     * Expected value is &#39;OnPremise&#39;.
     * 
     */
    public Output<String> source() {
        return this.source;
    }

    /**
     * The oms agent Id installed on the machine
     * 
     */
    @Import(name="sourceComputerId", required=true)
    private Output<String> sourceComputerId;

    /**
     * @return The oms agent Id installed on the machine
     * 
     */
    public Output<String> sourceComputerId() {
        return this.sourceComputerId;
    }

    /**
     * The unique Id of the machine
     * 
     */
    @Import(name="vmuuid", required=true)
    private Output<String> vmuuid;

    /**
     * @return The unique Id of the machine
     * 
     */
    public Output<String> vmuuid() {
        return this.vmuuid;
    }

    /**
     * Azure resource Id of the workspace the machine is attached to
     * 
     */
    @Import(name="workspaceId", required=true)
    private Output<String> workspaceId;

    /**
     * @return Azure resource Id of the workspace the machine is attached to
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    private OnPremiseResourceDetailsArgs() {}

    private OnPremiseResourceDetailsArgs(OnPremiseResourceDetailsArgs $) {
        this.machineName = $.machineName;
        this.source = $.source;
        this.sourceComputerId = $.sourceComputerId;
        this.vmuuid = $.vmuuid;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OnPremiseResourceDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OnPremiseResourceDetailsArgs $;

        public Builder() {
            $ = new OnPremiseResourceDetailsArgs();
        }

        public Builder(OnPremiseResourceDetailsArgs defaults) {
            $ = new OnPremiseResourceDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param machineName The name of the machine
         * 
         * @return builder
         * 
         */
        public Builder machineName(Output<String> machineName) {
            $.machineName = machineName;
            return this;
        }

        /**
         * @param machineName The name of the machine
         * 
         * @return builder
         * 
         */
        public Builder machineName(String machineName) {
            return machineName(Output.of(machineName));
        }

        /**
         * @param source The platform where the assessed resource resides
         * Expected value is &#39;OnPremise&#39;.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The platform where the assessed resource resides
         * Expected value is &#39;OnPremise&#39;.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param sourceComputerId The oms agent Id installed on the machine
         * 
         * @return builder
         * 
         */
        public Builder sourceComputerId(Output<String> sourceComputerId) {
            $.sourceComputerId = sourceComputerId;
            return this;
        }

        /**
         * @param sourceComputerId The oms agent Id installed on the machine
         * 
         * @return builder
         * 
         */
        public Builder sourceComputerId(String sourceComputerId) {
            return sourceComputerId(Output.of(sourceComputerId));
        }

        /**
         * @param vmuuid The unique Id of the machine
         * 
         * @return builder
         * 
         */
        public Builder vmuuid(Output<String> vmuuid) {
            $.vmuuid = vmuuid;
            return this;
        }

        /**
         * @param vmuuid The unique Id of the machine
         * 
         * @return builder
         * 
         */
        public Builder vmuuid(String vmuuid) {
            return vmuuid(Output.of(vmuuid));
        }

        /**
         * @param workspaceId Azure resource Id of the workspace the machine is attached to
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId Azure resource Id of the workspace the machine is attached to
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public OnPremiseResourceDetailsArgs build() {
            $.machineName = Objects.requireNonNull($.machineName, "expected parameter 'machineName' to be non-null");
            $.source = Codegen.stringProp("source").output().arg($.source).require();
            $.sourceComputerId = Objects.requireNonNull($.sourceComputerId, "expected parameter 'sourceComputerId' to be non-null");
            $.vmuuid = Objects.requireNonNull($.vmuuid, "expected parameter 'vmuuid' to be non-null");
            $.workspaceId = Objects.requireNonNull($.workspaceId, "expected parameter 'workspaceId' to be non-null");
            return $;
        }
    }

}
