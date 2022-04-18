// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The value to be compared with the metric.
 * 
 */
public final class SecurityProfileMetricValue extends com.pulumi.resources.InvokeArgs {

    public static final SecurityProfileMetricValue Empty = new SecurityProfileMetricValue();

    /**
     * If the ComparisonOperator calls for a set of CIDRs, use this to specify that set to be compared with the metric.
     * 
     */
    @Import(name="cidrs")
      private final @Nullable List<String> cidrs;

    public List<String> cidrs() {
        return this.cidrs == null ? List.of() : this.cidrs;
    }

    /**
     * If the ComparisonOperator calls for a numeric value, use this to specify that (integer) numeric value to be compared with the metric.
     * 
     */
    @Import(name="count")
      private final @Nullable String count;

    public Optional<String> count() {
        return this.count == null ? Optional.empty() : Optional.ofNullable(this.count);
    }

    /**
     * The numeral value of a metric.
     * 
     */
    @Import(name="number")
      private final @Nullable Double number;

    public Optional<Double> number() {
        return this.number == null ? Optional.empty() : Optional.ofNullable(this.number);
    }

    /**
     * The numeral values of a metric.
     * 
     */
    @Import(name="numbers")
      private final @Nullable List<Double> numbers;

    public List<Double> numbers() {
        return this.numbers == null ? List.of() : this.numbers;
    }

    /**
     * If the ComparisonOperator calls for a set of ports, use this to specify that set to be compared with the metric.
     * 
     */
    @Import(name="ports")
      private final @Nullable List<Integer> ports;

    public List<Integer> ports() {
        return this.ports == null ? List.of() : this.ports;
    }

    /**
     * The string values of a metric.
     * 
     */
    @Import(name="strings")
      private final @Nullable List<String> strings;

    public List<String> strings() {
        return this.strings == null ? List.of() : this.strings;
    }

    public SecurityProfileMetricValue(
        @Nullable List<String> cidrs,
        @Nullable String count,
        @Nullable Double number,
        @Nullable List<Double> numbers,
        @Nullable List<Integer> ports,
        @Nullable List<String> strings) {
        this.cidrs = cidrs;
        this.count = count;
        this.number = number;
        this.numbers = numbers;
        this.ports = ports;
        this.strings = strings;
    }

    private SecurityProfileMetricValue() {
        this.cidrs = List.of();
        this.count = null;
        this.number = null;
        this.numbers = List.of();
        this.ports = List.of();
        this.strings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileMetricValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> cidrs;
        private @Nullable String count;
        private @Nullable Double number;
        private @Nullable List<Double> numbers;
        private @Nullable List<Integer> ports;
        private @Nullable List<String> strings;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileMetricValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrs = defaults.cidrs;
    	      this.count = defaults.count;
    	      this.number = defaults.number;
    	      this.numbers = defaults.numbers;
    	      this.ports = defaults.ports;
    	      this.strings = defaults.strings;
        }

        public Builder cidrs(@Nullable List<String> cidrs) {
            this.cidrs = cidrs;
            return this;
        }
        public Builder cidrs(String... cidrs) {
            return cidrs(List.of(cidrs));
        }
        public Builder count(@Nullable String count) {
            this.count = count;
            return this;
        }
        public Builder number(@Nullable Double number) {
            this.number = number;
            return this;
        }
        public Builder numbers(@Nullable List<Double> numbers) {
            this.numbers = numbers;
            return this;
        }
        public Builder numbers(Double... numbers) {
            return numbers(List.of(numbers));
        }
        public Builder ports(@Nullable List<Integer> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(Integer... ports) {
            return ports(List.of(ports));
        }
        public Builder strings(@Nullable List<String> strings) {
            this.strings = strings;
            return this;
        }
        public Builder strings(String... strings) {
            return strings(List.of(strings));
        }        public SecurityProfileMetricValue build() {
            return new SecurityProfileMetricValue(cidrs, count, number, numbers, ports, strings);
        }
    }
}
