// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.SyncPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of the connected registry parent.
 * 
 */
public final class ParentPropertiesArgs extends ResourceArgs {

    public static final ParentPropertiesArgs Empty = new ParentPropertiesArgs();

    /**
     * The resource ID of the parent to which the connected registry will be associated.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The resource ID of the parent to which the connected registry will be associated.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The sync properties of the connected registry with its parent.
     * 
     */
    @Import(name="syncProperties", required=true)
    private Output<SyncPropertiesArgs> syncProperties;

    /**
     * @return The sync properties of the connected registry with its parent.
     * 
     */
    public Output<SyncPropertiesArgs> syncProperties() {
        return this.syncProperties;
    }

    private ParentPropertiesArgs() {}

    private ParentPropertiesArgs(ParentPropertiesArgs $) {
        this.id = $.id;
        this.syncProperties = $.syncProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParentPropertiesArgs $;

        public Builder() {
            $ = new ParentPropertiesArgs();
        }

        public Builder(ParentPropertiesArgs defaults) {
            $ = new ParentPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The resource ID of the parent to which the connected registry will be associated.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The resource ID of the parent to which the connected registry will be associated.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param syncProperties The sync properties of the connected registry with its parent.
         * 
         * @return builder
         * 
         */
        public Builder syncProperties(Output<SyncPropertiesArgs> syncProperties) {
            $.syncProperties = syncProperties;
            return this;
        }

        /**
         * @param syncProperties The sync properties of the connected registry with its parent.
         * 
         * @return builder
         * 
         */
        public Builder syncProperties(SyncPropertiesArgs syncProperties) {
            return syncProperties(Output.of(syncProperties));
        }

        public ParentPropertiesArgs build() {
            $.syncProperties = Objects.requireNonNull($.syncProperties, "expected parameter 'syncProperties' to be non-null");
            return $;
        }
    }

}
