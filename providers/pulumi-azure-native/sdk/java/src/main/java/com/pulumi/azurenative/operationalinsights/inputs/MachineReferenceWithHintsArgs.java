// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * A machine reference with a hint of the machine&#39;s name and operating system.
 * 
 */
public final class MachineReferenceWithHintsArgs extends ResourceArgs {

    public static final MachineReferenceWithHintsArgs Empty = new MachineReferenceWithHintsArgs();

    /**
     * Resource URI.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Resource URI.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Specifies the sub-class of the reference.
     * Expected value is &#39;ref:machinewithhints&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return Specifies the sub-class of the reference.
     * Expected value is &#39;ref:machinewithhints&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    private MachineReferenceWithHintsArgs() {}

    private MachineReferenceWithHintsArgs(MachineReferenceWithHintsArgs $) {
        this.id = $.id;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MachineReferenceWithHintsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MachineReferenceWithHintsArgs $;

        public Builder() {
            $ = new MachineReferenceWithHintsArgs();
        }

        public Builder(MachineReferenceWithHintsArgs defaults) {
            $ = new MachineReferenceWithHintsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Resource URI.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource URI.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param kind Specifies the sub-class of the reference.
         * Expected value is &#39;ref:machinewithhints&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Specifies the sub-class of the reference.
         * Expected value is &#39;ref:machinewithhints&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public MachineReferenceWithHintsArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            return $;
        }
    }

}
