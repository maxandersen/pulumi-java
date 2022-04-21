// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetContactFlowModuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContactFlowModuleArgs Empty = new GetContactFlowModuleArgs();

    /**
     * Returns information on a specific Contact Flow Module by contact flow module id
     * 
     */
    @Import(name="contactFlowModuleId")
    private @Nullable String contactFlowModuleId;

    public Optional<String> contactFlowModuleId() {
        return Optional.ofNullable(this.contactFlowModuleId);
    }

    /**
     * Reference to the hosting Amazon Connect Instance
     * 
     */
    @Import(name="instanceId", required=true)
    private String instanceId;

    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Returns information on a specific Contact Flow Module by name
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of tags to assign to the Contact Flow Module.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetContactFlowModuleArgs() {}

    private GetContactFlowModuleArgs(GetContactFlowModuleArgs $) {
        this.contactFlowModuleId = $.contactFlowModuleId;
        this.instanceId = $.instanceId;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContactFlowModuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContactFlowModuleArgs $;

        public Builder() {
            $ = new GetContactFlowModuleArgs();
        }

        public Builder(GetContactFlowModuleArgs defaults) {
            $ = new GetContactFlowModuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder contactFlowModuleId(@Nullable String contactFlowModuleId) {
            $.contactFlowModuleId = contactFlowModuleId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetContactFlowModuleArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}
