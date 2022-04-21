// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListSiteIdentifiersAssignedToHostNameArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListSiteIdentifiersAssignedToHostNameArgs Empty = new ListSiteIdentifiersAssignedToHostNameArgs();

    /**
     * Name of the object.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private ListSiteIdentifiersAssignedToHostNameArgs() {}

    private ListSiteIdentifiersAssignedToHostNameArgs(ListSiteIdentifiersAssignedToHostNameArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListSiteIdentifiersAssignedToHostNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListSiteIdentifiersAssignedToHostNameArgs $;

        public Builder() {
            $ = new ListSiteIdentifiersAssignedToHostNameArgs();
        }

        public Builder(ListSiteIdentifiersAssignedToHostNameArgs defaults) {
            $ = new ListSiteIdentifiersAssignedToHostNameArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public ListSiteIdentifiersAssignedToHostNameArgs build() {
            return $;
        }
    }

}
