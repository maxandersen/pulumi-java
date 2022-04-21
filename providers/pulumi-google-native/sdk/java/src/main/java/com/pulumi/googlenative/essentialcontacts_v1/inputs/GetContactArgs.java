// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.essentialcontacts_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetContactArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContactArgs Empty = new GetContactArgs();

    @Import(name="contactId", required=true)
    private String contactId;

    public String contactId() {
        return this.contactId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetContactArgs() {}

    private GetContactArgs(GetContactArgs $) {
        this.contactId = $.contactId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContactArgs $;

        public Builder() {
            $ = new GetContactArgs();
        }

        public Builder(GetContactArgs defaults) {
            $ = new GetContactArgs(Objects.requireNonNull(defaults));
        }

        public Builder contactId(String contactId) {
            $.contactId = contactId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetContactArgs build() {
            $.contactId = Objects.requireNonNull($.contactId, "expected parameter 'contactId' to be non-null");
            return $;
        }
    }

}
