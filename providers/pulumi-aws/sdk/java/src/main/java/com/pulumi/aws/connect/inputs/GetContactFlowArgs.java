// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetContactFlowArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContactFlowArgs Empty = new GetContactFlowArgs();

    /**
     * Returns information on a specific Contact Flow by contact flow id
     * 
     */
    @Import(name="contactFlowId")
    private @Nullable String contactFlowId;

    public Optional<String> contactFlowId() {
        return Optional.ofNullable(this.contactFlowId);
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
     * Returns information on a specific Contact Flow by name
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A the map of tags to assign to the Contact Flow.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies the type of Contact Flow.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private GetContactFlowArgs() {}

    private GetContactFlowArgs(GetContactFlowArgs $) {
        this.contactFlowId = $.contactFlowId;
        this.instanceId = $.instanceId;
        this.name = $.name;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContactFlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContactFlowArgs $;

        public Builder() {
            $ = new GetContactFlowArgs();
        }

        public Builder(GetContactFlowArgs defaults) {
            $ = new GetContactFlowArgs(Objects.requireNonNull(defaults));
        }

        public Builder contactFlowId(@Nullable String contactFlowId) {
            $.contactFlowId = contactFlowId;
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

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public GetContactFlowArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}
