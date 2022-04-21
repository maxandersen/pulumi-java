// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * GroupSubject holds detailed information for group-kind subject.
 * 
 */
public final class GroupSubjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupSubjectArgs Empty = new GroupSubjectArgs();

    /**
     * name is the user group that matches, or &#34;*&#34; to match all user groups. See https://github.com/kubernetes/apiserver/blob/master/pkg/authentication/user/user.go for some well-known group names. Required.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private GroupSubjectArgs() {}

    private GroupSubjectArgs(GroupSubjectArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupSubjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupSubjectArgs $;

        public Builder() {
            $ = new GroupSubjectArgs();
        }

        public Builder(GroupSubjectArgs defaults) {
            $ = new GroupSubjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GroupSubjectArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
