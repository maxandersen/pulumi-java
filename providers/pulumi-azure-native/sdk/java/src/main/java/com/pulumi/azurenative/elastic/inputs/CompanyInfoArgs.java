// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.elastic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Company information of the user to be passed to partners.
 * 
 */
public final class CompanyInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final CompanyInfoArgs Empty = new CompanyInfoArgs();

    /**
     * Business of the company
     * 
     */
    @Import(name="business")
    private @Nullable Output<String> business;

    public Optional<Output<String>> business() {
        return Optional.ofNullable(this.business);
    }

    /**
     * Country of the company location.
     * 
     */
    @Import(name="country")
    private @Nullable Output<String> country;

    public Optional<Output<String>> country() {
        return Optional.ofNullable(this.country);
    }

    /**
     * Domain of the company
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * Number of employees in the company
     * 
     */
    @Import(name="employeesNumber")
    private @Nullable Output<String> employeesNumber;

    public Optional<Output<String>> employeesNumber() {
        return Optional.ofNullable(this.employeesNumber);
    }

    /**
     * State of the company location.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private CompanyInfoArgs() {}

    private CompanyInfoArgs(CompanyInfoArgs $) {
        this.business = $.business;
        this.country = $.country;
        this.domain = $.domain;
        this.employeesNumber = $.employeesNumber;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CompanyInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CompanyInfoArgs $;

        public Builder() {
            $ = new CompanyInfoArgs();
        }

        public Builder(CompanyInfoArgs defaults) {
            $ = new CompanyInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder business(@Nullable Output<String> business) {
            $.business = business;
            return this;
        }

        public Builder business(String business) {
            return business(Output.of(business));
        }

        public Builder country(@Nullable Output<String> country) {
            $.country = country;
            return this;
        }

        public Builder country(String country) {
            return country(Output.of(country));
        }

        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public Builder employeesNumber(@Nullable Output<String> employeesNumber) {
            $.employeesNumber = employeesNumber;
            return this;
        }

        public Builder employeesNumber(String employeesNumber) {
            return employeesNumber(Output.of(employeesNumber));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public CompanyInfoArgs build() {
            return $;
        }
    }

}
